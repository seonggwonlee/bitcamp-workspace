package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0110 {
  public static void main(String[] args) {

    ExecutorService threadPool = Executors.newFixedThreadPool(3);
    threadPool.execute(() -> System.out.printf("%s - Hello\n", Thread.currentThread().getName()));
    // -> 람다문법 까지 적용됨


    // 메서드 안에 선언된 클래스는 로컬 클래스.
    // 로컬 클래스를 1개만 사용한다고 하면 익명 클래스로 선언 가능
    // 여기서는 익명 클래스 선언 후 인스턴스 1개만 사용하므로 따로 인스턴스를 생성치 않고
    // execute()에 바로 선언
    // 그 후 람다문법으로 변환
    threadPool.shutdown();

    System.out.println("main() 종료");
  }
}
