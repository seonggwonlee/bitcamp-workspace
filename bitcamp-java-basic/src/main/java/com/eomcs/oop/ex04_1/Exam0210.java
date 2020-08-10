package com.eomcs.oop.ex04_1;

public class Exam0210 {

  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");

    char c = s1.charAt(1); // s1인스턴스의 값을 조회하는 메서드 사용
    System.out.println(c);

    System.out.println("----------");
    System.out.println(s1.compareTo("Helli"));
    System.out.println(s1.compareTo("Hello"));
    System.out.println(s1.compareTo("Hellu"));

    System.out.println("----------");
    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ee"));

    System.out.println("----------");
    String s2 = s1.concat(", world!"); // s1의 문자열과 연결하는 메서드
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("----------");
    System.out.println(s1.equals("aaa"));
    System.out.println(s1.equals("Hello")); // 두 인스턴스에 들어있는 문자열이 같은지 비교

    String s3 = new String("ABC가각");

    System.out.println("----------");
    byte[] bytes = s3.getBytes();
     // 인스턴스에 들어있는 문자열을 바이트 배열로 변환하여 리턴한다
     // 바이트 배열로 변환하여 리턴시 OS의 문자체계를 따라간다.
    for (int i = 0; i < bytes.length; i++)
      System.out.printf("%x,", bytes[i]);
    System.out.println();

    bytes = s3.getBytes("EUC-KR");

    for (int i = 0; i < bytes.length; i++)
      System.out.printf("%x,", bytes[i]);
    System.out.println();
    // 문자 체계에 의해서 출력값이 달라질 수 있다. 따라서 문자열을 바이트 배열로 변환할 시
    // 문자 체계가 OS마다 다르기 때문에 직접 지정해주는 것이 좋다.


  }
}
