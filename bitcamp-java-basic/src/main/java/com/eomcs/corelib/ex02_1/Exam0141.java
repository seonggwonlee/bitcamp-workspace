package com.eomcs.corelib.ex02_1;

public class Exam0141 {
  public static void main(String[] args) {

    Object obj = new String("Hello");

    String x1 = (String)obj; // x1에 String 인스턴스 주소가 담긴다.
    String x2 = obj.toString(); // x2에 String 인스턴스 주소가 담긴다.
    // obj가 가리키는 것은 String 객체이다.
    // 이럴 때는 toString 호출시 String 객체부터 찾는다.
    // 즉, String 인스턴스를 가리키는 변수 obj를 호출할 때 toString으로 호출하였으므로
    // String 객체부터 찾으면서 올라가는 것이다. (Object 클래스까지)
    // 그리고 실제로 String 클래스가 toString을 오버라이딩 했으므로 String의 toString을 호출하게 될 것이다.

    System.out.println(x1 == x2);
  }
}
