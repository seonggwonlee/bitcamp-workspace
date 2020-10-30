package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0510 {

  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();

    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      while (true) {
        System.out.print("첨부파일:(완료는 그냥 엔터!) ");
        String filename = keyScan.nextLine();
        if (filename.length() == 0) {
          break;
        }
        files.add(filename);
      }
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");

        // => 게시글을 입력할 때 자동 생성된 PK 값을 받겠다고 설정한다.
        PreparedStatement boardStmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?,?)",
            Statement.RETURN_GENERATED_KEYS);

        PreparedStatement fileStmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?,?)")) {

      // 게시글 입력
      boardStmt.setString(1, title);
      boardStmt.setString(2, contents);
      int count = boardStmt.executeUpdate();
      System.out.printf("%d 개 게시글 입력 성공!\n", count);


      // AutoCommit의 문제점
      // insert/update/delete시 바로바로 적용하기 때문에 다음 수행 작업이 실패해도
      // 이전 수행작업이 유효하게 적용되는 것이다.

      // 왜?
      // - 여러 개의 insert/update/delete 작업이 한 작업 단위로 묶이는 경우에는
      // 이런 방식이 옳지않다.
      // 예를 들어 제품을 주문하는 경우, 주문 정보를 주문 테이블에 입력하고
      // 결제 정보를 결제 테이블에 입력할 때 실패하면 이전 주문정보는 무효해야한다.

      // 연속적으로 수행하는 여러 개의 작업을 한 단위로 묶기 위해선
      // 작업 수행 전 auto commit을 false로 설정하여 모든 작업을 끝낸 후 commit() 요청한다.
      // false로 작업을 수행한다면 중간작업 중 오류가 발생하더라도 rollback()으로 작업 전 상태
      // 로 되돌린다.
      // 참고로 여러 개의 작업을 한 단위로 묶은 것을 "트랜잭션"이라고 한다.
      // 한 마디로 트랜잭션을 다룰 때는 auto commit을 수동으로 한다.


      // 위에서 입력한 게시글의 PK 값을 알아내기
      ResultSet keyRS = boardStmt.getGeneratedKeys();
      keyRS.next(); // PK가 들어있는 레코드를 한 개 가져온다.
      int boardId = keyRS.getInt(1); // 레코드에서 컬럼 값을 꺼낸다.

      // 첨부파일 입력
      int fileCount = 0;
      for (String filename : files) {
        fileStmt.setString(1, filename);

        // 위에서 게시글 입력 후에 자동 생성된 PK 값을 사용한다.
        fileStmt.setInt(2, boardId);

        fileStmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d 개 첨부파일 입력 성공!\n", fileCount);
    }
  }
}