package com.eomcs.pms.dao.mariadb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;

public class ProjectDaoImpl implements com.eomcs.pms.dao.ProjectDao {

  SqlSessionFactory sqlSessionFactory;

  public ProjectDaoImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Project project) throws Exception {

      try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
          //프로젝트 정보 입력
          int count = sqlSession.insert("ProjectDao.insert", project);

          //프로젝트 멤버 정보 입력
          for (Member member : project.getMembers()) {
            Map<String,Object> map = new HashMap<>();
            map.put("memberNo", member.getNo());
            map.put("projectNo", project.getNo());
            System.out.printf("%d %d\n", member.getNo(), project.getNo());
            sqlSession.insert("ProjectDao.insertMember", map);
          }

            sqlSession.commit();
            return count;
      }

      // 위의 입력을 수행한 후 일부로 다음 입력을 60초 정도 지연시킨다.
      //Thread.sleep(60000);

      // 프로젝트에 참여하는 멤버의 정보를 저장한다.
//      try (PreparedStatement stmt2 = con.prepareStatement(
//          "insert into pms_member_project(member_no, project_no) values(?,?)")) {
//        for (Member member : project.getMembers()) {
//          stmt2.setInt(1, member.getNo());
//          stmt2.setInt(2, project.getNo());
//          stmt2.executeUpdate();
//        }
//      }
  }
  @Override
  public int delete(int no) throws Exception {
      try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
        sqlSession.delete("ProjectDao.deleteMembers", no);

      int count = sqlSession.delete("ProjectDao.delete", no);

      sqlSession.commit();
      return count;

    }
  }

  @Override
  public Project findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("ProjectDao.findByNo", no);
    }
  }

  @Override
  public List<Project> findAll() throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      List<Project> projects = sqlSession.selectList("ProjectDao.findAll");
      return projects;
    }
  }

  @Override
  public List<Project> findByKeyword(String item, String keyword) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      HashMap<String,Object> map = new HashMap<>();
      map.put("item", item);
      map.put("keyword", keyword);
      List<Project> projects = sqlSession.selectList("ProjectDao.findByKeyword", map);
      return projects;
    }
  }

  @Override
  public List<Project> findByDetailKeyword(Map<String,Object> keywords) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("ProjectDao.findByDetailKeyword", keywords);
    }
  }

  @Override
  public int update(Project project) throws Exception {
      try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

        int count = sqlSession.update("ProjectDao.update", project);
        if (count == 0) {
          return 0;
        }
        sqlSession.delete("ProjectDao.deleteMembers",project.getNo());
        for (Member member : project.getMembers()) {
          HashMap<String,Object> map = new HashMap<>();
          map.put("memberNo", member.getNo());
          map.put("projectNo", project.getNo());
          sqlSession.insert("ProjectDao.insertMember", map);
      }
      sqlSession.commit();
      return 1;
    }
  }
}
