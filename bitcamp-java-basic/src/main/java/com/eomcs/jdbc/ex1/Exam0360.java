package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0360 {
  public static void main(String[] args) {
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {

      int count = stmt.executeUpdate(
          "delete from x_board where board_id = 1");
      System.out.printf("%d개 삭제 성공", count);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
