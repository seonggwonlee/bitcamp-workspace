package oop.ex12;

public class Exam0210 {

	interface Player {
		void play();
	}
	
	public static void main(String[] args) {
		Player p = () -> System.out.println("Player...");
		p.play();
		
		// 추상메서드가 1개인 인터페이스에 대해서만 람다문법 가능
	}
}
