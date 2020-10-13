package oop.ex12;

public class Exam0220 {

	interface Player {
		void play();
		//void stop();
	}
	
	public static void main(String[] args) {
		Player p = () -> System.out.println("2개 메서드");
		p.play();
		
		// 추상 메서드가 2개 이상이면 람다문법 구현 불가능
	}
}
