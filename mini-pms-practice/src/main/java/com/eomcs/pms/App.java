/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;

import java.util.Scanner;

public class App {

//  static class Member {
//    int no;
//    String name;
//    String email;
//    String password;
//    String picture;
//    String tel;
//    Date registeredDate = new Date(System.currentTimeMillis());
//  }
//
//  static final int LENGTH = 5;
//  static int size = 0;
//  static Member[] members = new Member[LENGTH];
//
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    loop:
    while (true) {
      System.out.print("명령> ");
      String input = in.nextLine();

      switch (input) {
        case "/member/add" :
          System.out.println("[회원 등록]");
          break;
        case "/member/list" :
          System.out.println("[회원 목록]");
          break;
        case "exit" :
        case "quit" :
          System.out.println("입력을 종료합니다.");
          break loop;
        default :
          System.out.println("실행할 수 없는 명령입니다.");
        }
    }
    in.close();
  }
}
//    System.out.println("[회원]" );
//    inputMembers();
//    System.out.println("--------------------");
//    printMembers();
//  }
//
//  static void inputMembers() {

//
//      for (int i = 0; i < LENGTH; i++) {
//
//          Member member = new Member();
//
//          System.out.print("번호? ");
//          member.no = Integer.parseInt(in.nextLine());
//
//          System.out.print("이름? ");
//          member.name = in.nextLine();
//
//          System.out.print("이메일? ");
//          member.email = in.nextLine();
//
//          System.out.print("암호? ");
//          member.password = in.nextLine();
//
//          System.out.print("사진? ");
//          member.picture = in.nextLine();
//
//          System.out.print("전화? ");
//          member.tel = in.nextLine();
//
//          member.registeredDate = new Date(System.currentTimeMillis());
//
//          members[size++] = member;
//
//          System.out.print("계속 입력하시겠습니까?(Y/n)");
//          String answer = in.nextLine();
//          if (!answer.equalsIgnoreCase("y")) {
//            break;
//          }
//          System.out.println("빈줄 출력");
//        }
//      in.close();
//  }
//    static void printMembers() {
//      for (int i = 0; i < size; i++) {
//        Member m = members[i];
//        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", m.no, m.name, m.email, m.password,
//            m.picture, m.tel, m.registeredDate);
//      }
//    }
