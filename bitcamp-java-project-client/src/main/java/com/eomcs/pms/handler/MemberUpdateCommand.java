package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class MemberUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 변경]");
    int no = Prompt.inputInt("번호? ");

    String name = null;
    String email = null;
    String photo = null;
    String tel = null;

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "select name, email, photo, tel"
            + " from pms_member"
            + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
          name = rs.getString("name");
          email = rs.getString("email");
          photo = rs.getString("photo");
          tel = rs.getString("tel");

        } else {
          System.out.println("해당 회원이 존재하지 않습니다.");
          return;
        }
      } catch (Exception e) {
        System.out.println("게시글 조회 중 오류 발생");
        e.printStackTrace();
        return;
      }

    name = Prompt.inputString(String.format("이름(%s)? ", name));
    email = Prompt.inputString(String.format("이메일(%s)? ", email));
    photo = Prompt.inputString(String.format("사진?(%s)? ", photo));
    tel = Prompt.inputString(String.format("전화번호?(%s)? ", tel));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "update pms_member set name = ?, email = ?, photo = ?, tel = ? where no = ?")) {

      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setString(3, photo);
      stmt.setString(4, tel);
      stmt.setInt(5, no);
      // update 문장은 executeUpdate()를 사용하여 서버에 전달한다.
      int count = stmt.executeUpdate(); //

      if (count == 0) {
        System.out.println("해당 회원이 존재하지 않습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("수정 중 오류 발생");
      e.printStackTrace();
    }
  }
}
