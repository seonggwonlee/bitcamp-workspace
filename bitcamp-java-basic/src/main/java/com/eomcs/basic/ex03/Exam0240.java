// Exam0240.java
// 주제 : 정수값을 메모리에 저장하는 방법

package com.eomcs.basic.ex03;

class Exam0240 {
    int a = 0xaaaaaaaa;
    int b = -0xaaaaaaaa;
    public static void main(String[] args) {

        System.out.println(5 - 3);
        System.out.println(5 + (-3));
     }
}

// 0000 0011 <-- +3의 2진수 
// 1111 1101 <-- -3의 2의 보수
// 1000 0011 <-- -3의 Sign-Magnitude
// 0111 1100 <-- -3의 Excess-K (127 - 3 = 124의 2진수 표현)

// * K(bias) = 2**(비트수 - 1) - 1 = 2**(8 - 1) -1 = 2**7 - 1 = 128 - 1


// 10101010 10101010 10101010 10101010 <-- +aaaaaaaa 2진수 
// 01010101 01010101 01010101 01010110 <-- -aaaaaaaa 2의 보수
// 55 55 55 56 <-- -aaaaaaaa의 16진수
// 즉 +aaaaaaaa의 음수 표기는 java에선 2의 보수로 표기된다. (Hex dump로 확인시 증명)

// 1111 1011 <-- -123의 Sign-Magnitude
// 0000 0100 <-- -123의 Excess-K (127 - 3 = 124의 2진수 표현)


/* 
0000_0011(3) -> 1111_1100(1의 보수) -> 1111_1101(2의 보수) = -3
0000_0101(5) + 1111_1101(-3) = 0000_0010(2)
*/
