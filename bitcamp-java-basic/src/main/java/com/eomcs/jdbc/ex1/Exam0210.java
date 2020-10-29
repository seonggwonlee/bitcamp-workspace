package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0210 {
  public static void main(String[] args) {
    java.sql.Connection con = null;

    try {
      con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb", "study", "1111");

      System.out.printf("%s DBMS와 연결됨\n", con.getClass().getName());

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        con.close();
      } catch (Exception e) {

      }
      System.out.println("연결이 해제됨");
    }
  }
}
