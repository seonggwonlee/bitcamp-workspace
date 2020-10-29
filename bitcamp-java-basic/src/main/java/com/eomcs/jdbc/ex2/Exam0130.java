package com.eomcs.jdbc.ex2;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;
import java.util.Scanner;

public class Exam0130 {
  public static void main(String[] args) {

    int no = 0;

    try (Scanner in = new Scanner(System.in)) {
      System.out.print("번호?");
      no = Integer.parseInt(in.nextLine());
    }

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board where board_id=" + no)) {

      if (rs.next()) {
        // 리턴 결과가 '참'이라면 아래 항목들을 출력한다.
        System.out.printf("제목: %s\n", rs.getString("title"));
        System.out.printf("내용: %s\n", rs.getString("contents"));
        System.out.printf("등록일: %s\n", rs.getString("created_date"));
        System.out.printf("조회수: %s\n", rs.getString("view_count"));
      } else {
        System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
