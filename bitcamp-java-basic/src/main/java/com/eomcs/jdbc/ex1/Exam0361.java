package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0361 {
  public static void main(String[] args) {
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {

      // 부모 테이블의 데이터를 지우려면 부모 테이블에 데이터를 참조하는 자식 테이블의 데이터를
      // 먼저 지워야 한다.
      int count = stmt.executeUpdate(
          "delete from x_board_file where board_id = 4");
      System.out.printf("x_board file table : %d개 삭제 성공\n", count);

      // 부모 테이블의 데이터를 지운다.
      count = stmt.executeUpdate(
          "delete from x_board where board_id = 4");
      System.out.printf("x_board table : %d개 삭제 성공\n", count);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
