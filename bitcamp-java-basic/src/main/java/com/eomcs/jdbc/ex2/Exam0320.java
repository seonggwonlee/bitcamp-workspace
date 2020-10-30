package com.eomcs.jdbc.ex2;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exam0320 {
  public static void main(String[] args) {
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board order by board_id desc");
        java.sql.ResultSet rs = stmt.executeQuery(
            )) {

      System.out.println("번호, 제목, 등록일, 조회수");
      while (rs.next()) {
        // 리턴 결과가 '참'이라면 아래 항목들을 출력한다.
        System.out.printf("%d, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
