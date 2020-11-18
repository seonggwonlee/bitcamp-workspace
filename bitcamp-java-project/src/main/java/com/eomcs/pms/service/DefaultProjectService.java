package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultProjectService implements ProjectService {

  TaskDao taskDao;
  ProjectDao projectDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultProjectService(TaskDao taskDao, ProjectDao projectDao,
      SqlSessionFactoryProxy factoryProxy) {

    this.taskDao = taskDao;
    this.projectDao = projectDao;
    this.factoryProxy = factoryProxy;

  }

@Override
public int delete(int no) throws Exception {
  try {
    factoryProxy.startTransaction();
    taskDao.deleteByProjectNo(no);
    projectDao.deleteMembers(no);
    int count = projectDao.delete(no);
    factoryProxy.commit();
    return count;

  } catch (Exception e) {
    factoryProxy.rollback();
    throw e;

  } finally {
    factoryProxy.endTransaction();
    }
  }

@Override
public int add(Project project) throws Exception {
  try {
    factoryProxy.startTransaction();
    projectDao.insert(project);
    projectDao.insertMembers(project);
    factoryProxy.commit();
    return 1;
  } catch (Exception e) {
    factoryProxy.rollback();
    throw e;
  } finally {
    factoryProxy.endTransaction();
    }
  }

@Override
public List<Project> list() throws Exception {
  return projectDao.findAll();
  }
}
