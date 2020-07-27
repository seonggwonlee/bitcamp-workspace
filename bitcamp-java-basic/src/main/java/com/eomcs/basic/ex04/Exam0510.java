package com.eomcs.basic.ex04;

public class Exam0510 {
  public static void main (String[] args) {
    
    int[] p = new int[3]; // c언어로 따지면 (int*)malloc(sizeof(int) *3))
    // p는 int배열의 주소를 담는 변수이다.
    // 자바에서는 주소를 담는 변수를 '레퍼런스'라 부른다.
    // new int[3]은 int 변수를 연속해서 3개 확보한다.
    // 메모리를 확보한 후 리턴 값은 그 메모리의 시작 주소이다.
    
    // new 명령으로 확보한 메모리를 인스턴스(instance)라고 칭한다.
    // 인스턴스의 주소를 저장하는 변수를 레퍼런스(reference)라고 칭한다.
    
    // 배열의 개수(길이) 알아내기
    System.out.println(p.length);
    
    // 배열의 주소가 없는 상태에서는 사용하지 말아야 한다.
    int[] x;
    // x = null; // null은 주소없음을 의미한다. 
    // System.out.println(x.length);
    
    // 배열에 값 저장
    p[0] = 100;
    p[1] = 200;
    p[2] = 300;
    // *(p + 1) = 100; ==> 해당 문법은 자바에서 사용할 수 없다.
    System.out.printf("%d, %d, %d\n", p[0], p[1], p[2]);
    
    //p[3] = 400; // 실행 예외 발생(runtime exception)
    //p[-1] = 500; // 실행 예외 발생(runtime exception) 
    // C처럼 인덱스의 범위를 넘어갈 수 없다.
    
    int sum = 0;
    for (int i = 0; i < p.length; i++) {
      sum = sum + p[i];
    }
    System.out.println(sum);
        
    // 배열 레퍼런스를 선언하는 방법
    int[] p2; // 자바에서 주로 사용하는 방식
    int p3[]; // c언어 방식도 사용가능. 단 개수를 지정해서는 안된다.
    
    p2 = p; // p 레퍼런스 변수에 저장된 주소를 p2 레퍼런스 변수에 복사한다.
    
    p2[1] = 1000;
    System.out.println(p[1]); // p2의 1번 주소와 p의 1번 주소가 같은 곳을 가리키기 때문에 1000이 출

    p = new int[4]; // 원래의 p 주소대신 새로운 배열의 주소가 들어가게 된다.
    p[1] = 2000;
    System.out.printf("%d, %d\n", p[1], p2[1]);
    
    // System.out.println(p[3]);    // 값이 지정되지 않았으므로 컴파일 오류
    // System.println(p); 자바는 주소값을 알 수 없다.
    
    // 레퍼런스 변수의 주소 값을 0으로 초기화하기
    // p2 = 0; // 직접적으로 값을 0을 부여할(초기화할) 수 없다. (C는 가능)
    p2 = null; // 주소 변수(레퍼런스)를 0으로 초기화시키려면 null 사용   
    // null은 레퍼런스 변수로써 주소를 0으로 초기화시킨 의미다.
    // System.out.println(p2[0]); // runtime exception
    
    int k1;
    // System.out.println(k1); // 변수 초기화 시키지 않고 사용하면 컴파일 오류
    
    int[] k2 = new int[3]; // new명령으로 메모리 준비할 때 모든 메모리는 0으로 자동 초기화 된다.
    // 따라서 따로 초기화할 필요 없이 바로 사용할 수 있다.
    System.out.println(k2[0]);
    System.out.println(k2[1]);
    System.out.println(k2[2]);
    
    // 배열 생성 후 즉시 초기화하기
    int[] k3 = new int[] {100, 200, 300};
    // ==> {}내 값을 넣을 수 있는 int 배열을 만든 후 그 배열에 값을 넣는다. 배열의 개수를 지정해서는 아니한다.
    
    int[] k4;
    k4 = new int[] {10, 20};
    
    int[] k5 = {11, 12, 13}; // == new int[] {11, 12, 13};
    
    int[] k6;
    // k6 = {111, 222, 333}; // 해당 문법은 변수 선언과 함께일 때만 new int없이 사용할 수 있다.
    
    int[] x1 = new int[3];
    int[] x2 = new int[4];
    int[] x3 = x1;
    
    x2 = x1; // x2가 가리켰던 int[4] 배열 메모리의 주소를 잃어 버려 더 이상 사용할 수 없다.
    // 주소를 잃어 버려 사용할 수 없는 메모리를 Garbage라고 한다.
    // Garbage는 JVM이 자동으로 해제 시킨다.
    // 단, 바로 해제시키지 않고, 특정 조건에 해당될 때 해제시킨다.
    // 조건 1) 메모리가 부족할 때
    // 조건 2) 시스템이 오래도록 한가할 때 (CPU가 한가할 때)
    // 결국 Garbage는 메모리에서 언제 해제시킬지는 알 수 없다.
    
    System.gc(); // 가능하다면 빠른 시일 내에 가비지를 수집해줄것을 요구한다.
    // gc()를 호출한다고 해서 Garbage collector가 바로 동작하는 것은 아니다.(JVM판단 하에 따라)
  }
}
