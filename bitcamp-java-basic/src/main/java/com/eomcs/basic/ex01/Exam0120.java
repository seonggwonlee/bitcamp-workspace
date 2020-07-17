// Exam0120.java
// 주제 : 하나의 소스 파일에 여러 개의 클래스

package com.eomcs.basic.ex01;

class A {} // 클래스 블록
class B {}
class C {}

// 각각의 클래스 선언대로 bytecode가 만들어진다. 즉, 해당 소스파일에는 3개의 클래스가 선언됐으므로 3개의 bytecode 생성된다.
// 소스파일로 .class 파일이 생성되는 것은 아니다.