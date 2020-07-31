package com.eomcs.basic.ex06;


// 반복문 : while (조건) 문장;
public class Exam0310 {

  public static void main (String[] args) {
//    int count = 0;

//    while (count > 0) {
//      System.out.println("안녕");
//      System.out.println("dd");
//    } // 블록은 생략 가능하나, 단 한 문장이라도 블록을 하는 것이 권고사항

//    while (count++ < 10) {
//      System.out.println(count);
//    }

//    while
//      int temp = count;
//      count = count + 1;
//      boolean condition = temp < 10;
//
//      if (condition == true) {
//        System.out.println("안녕");
//      } 위 while 문을 기계어로 풀어쓴 것.

    // System.out.println("---------------");

    // int sum = 0;
    // while (count < 100) {
    //   count++;
    //   sum = sum + count;

// }
//     System.out.println(sum);

//int count = 0;
//while (count++ < 20) {
//  if (count % 2 != 0)
//    continue; // 즉시 조건문으로 이동하여 실행한다.
//  System.out.println(count);
//}

//int count = 0;
//while (count++ < 20) {
//  if (count > 5)
//    break; // 현재 소속된 반복문을 멈춘다.
//  System.out.println(count);
//}


//
//    int i = 2;
//    int j = 1;
//
//    loop :
//      while (i <= 9) {
//        j = 1;
//        while (j <= 9) {
//          System.out.printf("%d x %d = %d\n", i, j, (i * j));
//          if (i ==5 && j == 5)
//            continue loop; // loop라는 라벨을 추가함으로써 해당 라벨을 멈추면 while 블록에서 탈출한다.
//          j++;
//        }
//      i++;
//    }
//    System.out.println("5단까지출력 ");
//    // loop를 {} 사용하여 원하는 문장 까지 묶을 수 있다.


    int i = 0;

    do {
      System.out.println(i);
      i++;
    } while (i < 10);
  }
}
