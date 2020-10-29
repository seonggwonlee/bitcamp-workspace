package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0141 {
  public static void main(String[] args) {

//    System.out.printf("java.home=%s\n", System.getProperty("java.home"));
//    System.out.printf("user.home=%s\n", System.getProperty("user.home"));

//    System.setProperty("jdbc.drivers", "org.mariadb.jdbc..Driver:com.eomcs.jdbc.ex1.MyDriver");

    // 현재 jdbc.driver에 등록된 드라이버가 없다.
    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));


    try {
//      Class.forName("org.mariadb.jdbc.Driver");//java.sql 구현체 생성
//      Class.forName("oracle.jdbc.driver.OracleDriver");
//      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

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
