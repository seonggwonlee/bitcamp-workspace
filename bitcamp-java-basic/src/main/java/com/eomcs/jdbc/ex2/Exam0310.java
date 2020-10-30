package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0310 {
  public static void main(String[] args) {

    String title = null;
    String content = null;

    try (Scanner in = new Scanner(System.in)) {
      System.out.print("제목? ");
      title = in.nextLine();

      System.out.print("내용? ");
      content = in.nextLine();

      System.out.print("등록하시겠습니까?(Y/n)");
      String input = in.nextLine();
      if(!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소합니다.");
        return;
      }
    }
      try (Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
          PreparedStatement stmt = con.prepareStatement(
              "insert into x_board(title,contents) values(?,?)");) {

        stmt.setString(1, title);
        stmt.setString(2, content);

        int count = stmt.executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
