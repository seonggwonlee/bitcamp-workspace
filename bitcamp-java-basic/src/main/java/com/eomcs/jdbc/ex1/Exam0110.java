package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver driver = new org.mariadb.jdbc.Driver();//java.sql 구현체 생성
      DriverManager.registerDriver(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mssql:");
      System.out.println(driver2);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
