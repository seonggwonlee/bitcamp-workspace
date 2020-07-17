// Exam0100.java
// 주제 : 리터럴

package com.eomcs.basic.ex03;

class Exam0100 {

    public static void main(String[] args) {
        // 출력 명령문
            // - System.out.println(값);
        // [숫자]
            // - 정수 
                System.out.println(78);
                System.out.println(+78);
                System.out.println(-78);
                System.out.println(0116); // (78의 8진수)
                System.out.println(0x4e); // (78의 16진수)
                System.out.println(0b01001110); // (78의 2진수)
            
            // - 부동소수점 (floating point number)
                System.out.println(3.14);
                System.out.println(31.4e-1); //e-1 : 10의 -1승
                System.out.println(314e-2);
                System.out.println(0.0314e2);

        // [논리]
            // - true / false : 참 / 거짓
                System.out.println(true);
                System.out.println(false);

        // [문자]
            // - 문자
                System.out.println('A'); // 문자는 작은따옴표(싱글 코테이션(?))
                System.out.println('가');

            // - 문자열
                System.out.println("A");
                System.out.println("가");
                System.out.println("");
                System.out.println("ABC"); // 문자열은 큰따옴표(더블 코테이션(?))
                System.out.println("가나다");
    }
}