package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");

    // 인스턴스 메서드 (non-static 메서드)
    // 인스턴스 주소를 가지고 호출해야 한다.
    // this라는 내장 변수가 있다. (해당 인스턴스의 주소값을 가진)
    // 특정 인스턴스의 변수를 다루는 메서드

    char c1 = s1.charAt(1); // 대표적인 특정 인스턴스 변수를 다루는 인스턴스 메서드
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo("s2")); // 비교하는 문자열이 앞에 있는지 뒤에 있는지 알고 싶을 때 사용
    // s1이 양수면 비교 문자열보다 크기 때문에 뒤에 있고, 음수면 앞에 있다.

    System.out.println(s1.contains("ll")); // 문자열이 인스턴스에 포함된 단어라면 True, 아니면 false
    System.out.println(s2.contains("ll"));
    System.out.println(s1.equals(s2)); // s1이 가리키는 문자열과 파라미터로 넘겨주는 문자열과 비교하여 같으면 true 아니면 false

    System.out.println("----------------");
    byte[] bytes = s2.getBytes(); // JVM(UTF-16) ==> OS의 기본 문자체계에 따른다.
    // linux / unix => UTF-8 : 41 42 43 ea b0 80 ea b0 81 (ABC가각을 표현했을 시)
    // Windows => MS949 : 41 42 43 b0 a1 b0 a2 (ABC가각을 표현했을 시)
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff)); // 4바이트로 표현했을시 ffff가 붙기 때문에 없애기 위해 AND 연산자
    }
      System.out.println("----------------");
      bytes = s2.getBytes("ms949"); // JVM(UTF-16) ==> OS의 기본 문자체계에 따른다.
      // linux / unix => UTF-8 : 41 42 43 ea b0 80 ea b0 81 (ABC가각을 표현했을 시)
      // Windows => MS949 : 41 42 43 b0 a1 b0 a2 (ABC가각을 표현했을 시)

      for (byte b : bytes) {
        System.out.println(Integer.toHexString(b & 0xff));
    }
      System.out.println("----------------");

      String s3 = String.format("%s님 안녕하세요", "홍길동"); // 전형적 클래스 메서드 : 주어진 값으로만 처리한다.(특정 인스턴스 변수가 아닌)
      System.out.println(s3);

      String s4 = String.join(",", "홍길동", "임꺽정", "유관순"); // 전형적 클래스 메서드 : 주어진 값으로만 처리한다.(특정 인스턴스 변수가 아닌)
      System.out.println(s4);

      String s5 = String.valueOf(true); // 논리값이든, 정수든, 부동소수점이든 문자열로 변환 후 해당 주소를 리턴한다.
      String s6 = String.valueOf(100); // 논리값이든, 정수든, 부동소수점이든 문자열로 변환 후 해당 주소를 리턴한다.
      String s7 = String.valueOf(3.14f); // 논리값이든, 정수든, 부동소수점이든 문자열로 변환 후 해당 주소를 리턴한다.
      System.out.printf("%s, %s, %s\n", s5, s6, s7);

      System.out.println("----------------");
      System.out.println(Math.abs(-100));
      System.out.println(Math.ceil(-3.28));
      System.out.println(Math.floor(-3.28));
      System.out.println(Math.round(3.14)); // 반올림
      System.out.println(Math.round(3.54));
      System.out.println(Math.pow(2, 7)); // 제곱승 계산

      Date d1 = new Date();

      System.out.println(d1.getYear() + 1900);
      System.out.println(d1.getMonth() + 1); // 1월달이 0부터 시작함
      System.out.println(d1.getDate());
      System.out.println(d1.getDay());


      System.out.println("----------------");
      long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
      System.out.println(millis);
      System.out.println("----------------");


      java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
      System.out.println(d2.getYear() + 1900);
      System.out.println(d2.getMonth() + 1);
      System.out.println(d2.getDate());

      System.out.println("----------------");

      long curr = System.currentTimeMillis();
      Date d3 = new Date(curr);

      System.out.println(d3.getYear() + 1900);
      System.out.println(d3.getMonth() + 1);
      System.out.println(d3.getDate());

      System.out.println("----------------");
      Calendar cal = Calendar.getInstance(); // 생성자로 생성할 수 없는 클래스가 있다.
      System.out.println(cal.get(1)); // Year
      System.out.println(cal.get(2) + 1); // Month
      System.out.println(cal.get(5)); // Date
      System.out.println(cal.get(7)); // 요일 (1 ~ 7)
      System.out.println(cal.get(4)); // 해당 월의 몇번째 주인지
      System.out.println(cal.get(10)); // 12 Hour
      System.out.println(cal.get(11)); // 24 Hour
      System.out.println(cal.get(12)); // Minute
      System.out.println(cal.get(13)); // Second
      // 년,월,일을 출력하기 위해선 Calendar클래스가 더 낫다.

      System.out.println("----------------");
      System.out.println(cal.get(Calendar.YEAR)); // Year
      System.out.println(cal.get(Calendar.MONTH)); // Month
      System.out.println(cal.get(Calendar.DATE)); // Date
      System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일 (1 ~ 7)
      System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // 해당 월의 몇번째 주인지
      System.out.println(cal.get(Calendar.HOUR)); // 12 Hour
      System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24 Hour
      System.out.println(cal.get(Calendar.MINUTE)); // Minute
      System.out.println(cal.get(Calendar.SECOND)); // Second

      // int -> Integer, byte -> Byte, short -> Short, long -> Long,
      // float -> Float, double -> Double, char -> Character
      // => primitive Type을 인스턴스로 저장하기 위한 명령어
      System.out.println("----------------");
      Integer i1 = new Integer(100);
      Integer i2 = new Integer(100);

      System.out.println(i1.toString());
      System.out.println(i2.toString());
      System.out.println(i1 == i2);

      Integer i3 = Integer.valueOf(100);
      Integer i4 = Integer.valueOf(100);

      System.out.println(i3.toString());
      System.out.println(i4.toString());
      System.out.println(i3 == i4);
  }
}

// 문자열을 바이트 배열로 추출할 때 조심해야할 것 => JVM은 해당 OS의 문자체계를 따른다.
// 위 예제 처럼 같은 문자열이라도 Windows에선 다른 값으로 표현이 될 수 있다.
// 따라서 문자체계를 직접 지정하여 문자열을 표현하는 것이 좋다.(보통 UTF-8)
