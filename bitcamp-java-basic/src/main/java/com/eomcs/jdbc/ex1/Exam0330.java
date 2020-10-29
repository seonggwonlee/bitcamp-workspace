package com.eomcs.jdbc.ex1;
// *JDBC 프로그래밍
// 1) java.sql.Driver구현체를 DriverManager객체에 등록하여 Driver 구현을 관리
// 2) java.sql.DriveManager를 통해 DBMS와 연결

import java.sql.DriverManager;

public class Exam0330 {
  public static void main(String[] args) {
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id desc");) {

      boolean isReceived = rs.next();
      // true / false로만 리턴값 받는다.

      if (isReceived) {
        // 리턴 결과가 '참'이라면 아래 항목들을 출력한다.
        System.out.printf("%d, %s, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getString("contents"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));
      } else {
        System.out.println("레코드 가져오기 실패");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
