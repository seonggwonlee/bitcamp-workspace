package oop.ex12;

public class Exam0120 {

	interface Player {
		void play();
	}
	
	public static void main(String[] args) {
		Player p1 = () -> {
			System.out.println("테스트1");
		};
		p1.play();
		// 람다 기본구조
		
		Player p2 = () -> System.out.println("테스트2");
		p2.play();
		// 한 문장일 때는 중괄호 생략 가능
	}
}
