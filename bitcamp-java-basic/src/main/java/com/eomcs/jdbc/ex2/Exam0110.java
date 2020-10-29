package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0110 {
  public static void main(String[] args) {

    String title = null;
    String content = null;

    try (Scanner in = new Scanner(System.in)) {
      System.out.println("제목?");
      title = in.nextLine();

      System.out.println("내용?");
      content = in.nextLine();

      System.out.println("등록하시겠습니까?(Y/n)");
      String input = in.nextLine();
      if(!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소합니다.");
        return;
      }
    }
      try (Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
          Statement stmt = con.createStatement();) {

        String sql = String.format( //
            "insert into x_board(title,contents) values('%s','%s')", //
            title, content);
        int count = stmt.executeUpdate(sql);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
