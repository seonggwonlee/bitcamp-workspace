package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exam0320 {
  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중 \n", Thread.currentThread().getName());
        Thread.sleep(millisec);

        System.out.printf("%s 스레드 실행 종료 \n", Thread.currentThread().getName());

      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생\n", Thread.currentThread().getName());
      }
    }

    public static void main(String[] args) throws Exception {
      ExecutorService executorService = Executors.newFixedThreadPool(3);

      Future<?> future1 = executorService.submit(new MyRunnable(2000));
      Future<?> future2 = executorService.submit(new MyRunnable(4000));

      future1.get();
        System.out.println("첫번째 작업이 끝났음");
      future2.get();
        System.out.println("두번째 작업이 끝났음");

    System.out.println("main() 종료");
    }
  }
}
