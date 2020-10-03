package oop.ex12;

public class Exam0140 {

	interface Player {
		void play(String name, int age);
	}
	
	public static void main(String[] args) {
		Player p1 = (String name, int age) -> {
			System.out.printf("%s(%d)님 환영합니다.\n",name, age);
		};
		p1.play("홍길동", 20);
		
		Player p2 = (name, age) -> {
			System.out.printf("%s(%d)님, 환영합니다.\n",name, age);
		};
		p2.play("이순신", 30);
		
		// 여러 개의 파라미터는 1개의 파라미터와 동일하게 괄호안에 선언, 타입 생략 가능하지만
		// 괄호는 생략 불가능하다.
	}
}
