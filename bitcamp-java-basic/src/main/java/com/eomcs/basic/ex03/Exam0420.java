// Exam0240.java
// 주제 : 정수값을 메모리에 저장하는 방법

package com.eomcs.basic.ex03;

//# 문자 리터
public class Exam0420 {

    public static void main(String[] args) {
      
      // 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라 2바이트 코드로 저장한다. 

        System.out.println('A');
        System.out.println('가');
        System.out.println('\u0041'); // Unicode 직접 지정 - 키보드로 직접 입력할 수 없을
        
        System.out.println("0x41");
        System.out.println("65");
        
        
        
     }
}

// 문자를 메모리에 저장하기 위해선 2진수 변환이 가능해야한다.
// 문자를 2진수로 바꾸는 규칙을 "문자집합(Character Set)"이라 한다.
// 문자집합에는 여러 규칙이 존재한다.
//  - ASCII (7비트) : 영어 대소문자, 숫자, 특수문자 등
//      - 'A' => 100_0001 = 0x41
//      - 'B' => 100_0010 = 0x42
//      - '1' => 100_0001 = 0x31
//      - '2' => 100_0002 = 0x32
//      - '한글'(11172자)은 정의되어 있지 않다.

//  - ISO-8859-1 (8비트)
//      - ASCII 문자 + 유럽 문자

//  - EUC-KR(KSC-5601) (16비트)
//      - 한글 2,350자에 대한 규칙 추가
//      - '가' => 10110000_10100001 = 0xB0a1
//      - '각' => 10110000_10100010 = 0xB0a2
//      - 현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.

//  - Unicode (16비트, ISO 10646)
//      - 영어, 한글 모두 2바이트로 표현
//      - 일반적으로 통용되는 대부분 국가의 문자를 담고 있다.
//      - 'A' => 0x0041
//      - 'B' => 0x0042
//      - '1' => 0x0031
//      - '2' => 0x0032
//      - '가' => 0xac00
//      - '각' => 0xac01
//      - 영어는 2바이트로 표현하기 때문에 비효율적이다.
//      - 한글을 새로 정의했으므로 EUC-KR과 호환되지 않는다.

//  - UTF-8 (Universal Coded Character Set + Transformation Format, 8 ~ 32비트)
//      - Unicode에 있는 문자를 정해진 규칙에 따라 1 ~ 4바이트로 변환한다.
//      - 문자에 따라 바이트 크기가 다르다.

//      - 기존 ISO-8859-1은 1바이트로 표현한다.
//      - 'A' => 0x041
//      - 'B' => 0x42
//      - '1' => 0x31

//      - '한글'은 3바이트로 표현한다.
//      - 1110xxxx 10xxxxxx 10xxxxxx
//      - '가' => 0xac00(10101100_00000000, Unicode)
//          => 1110xxxx 10xxxxxx 10xxxxxx (변환규칙)
//          => 11101010 10110000 1000000 (규칙에 값 적용)
//          => 0xEAB080(UTF-8)
