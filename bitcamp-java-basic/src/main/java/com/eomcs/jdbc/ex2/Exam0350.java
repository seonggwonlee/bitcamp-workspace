package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0350 {
  public static void main(String[] args) throws Exception {

    String no = null;

    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = keyScan.nextLine();
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      stmt.executeUpdate( //
          "delete from x_board_file where board_id =" + no);
      // update 문장은 executeUpdate()를 사용하여 서버에 전달한다.
      int count = stmt.executeUpdate( //
          "delete from x_board where board_id =" + no);

      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.println("삭제하였습니다.");
      }
    }
  }
}
