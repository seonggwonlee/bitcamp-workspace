package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();//java.sql 구현체 생성
      java.sql.Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
      java.sql.Driver msSqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();

      DriverManager.registerDriver(mariadbDriver);
      DriverManager.registerDriver(oracleDriver);
      DriverManager.registerDriver(msSqlDriver);

      System.out.println("드라이버 등록 완료");

      java.sql.Driver driver1 = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver1);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);

      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
