package com.eomcs.oop.ex06_1.a;

public class Exam0411 {
  // Sedan과 Truck의 모델명과 cc를 출력.
  static void printSedan(Sedan sedan) {
    System.out.printf("모델명 : %s\n배기량 : %dcc\n", sedan.model, sedan.cc);
    System.out.println("-----------");
  }
  static void printTruck(Truck truck) {
    System.out.printf("모델명 : %s\n배기량 : %dcc\n", truck.model, truck.cc);
  }
  public static void main(String[] args) {
    Sedan s1 = new Sedan();

    s1.model = "티코";
    s1.cc = 890;

    printSedan(s1);

    Truck t1 = new Truck();

    t1.model = "타이탄II";
    t1.cc = 10000;

    printTruck(t1);

    // printTruck(s1);
    // Sedan의 레퍼런스 변수로는 Truck의 인스턴스를 가리키지 못 하기 때문에
    // 사용할 수 없다.

  }
}
