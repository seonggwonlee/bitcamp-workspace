package com.eomcs.basic.ex07;

import java.util.Properties;
import java.util.Set;

public class Exam0510 {

  // 실행하는 클래스는 다음과 같이 main() 메서드의 시그너처(signature)를 가져야 한다.
  // => method signature = function prototype == 메서드 선언
  // => 파라미터의 이름은 상관 없다. (한글도 상관없다.)
  // []가 없으면 Entry Point가 아닌 그저 이름만 main인 메서드가 된다.
  public static void main(String...args) {
    // 프로그램 아규먼트
    // > java Exam 0510 aaaa bbbb cccc

    System.out.println(args.length);

    System.out.println("----------");
    for (String str : args) {
      System.out.println("[" + str + "]");
    }
    System.out.println("---------");
    // JVM 아규먼트
    // > java -D이름=값 -D이름=값 Exam0510 공백주의!
    String s1 = System.getProperty("name");
    String s2 = System.getProperty("age");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("---------");

    // JVM의 전체 프로퍼티 목록
    // - JVM의 기본 환경 변수

    Properties props = System.getProperties();
    Set keyList = props.keySet();

    for (Object key : keyList) {
      System.out.printf("%s ---> %s\n", key, System.getProperty((String)key));
    }


  }
}
