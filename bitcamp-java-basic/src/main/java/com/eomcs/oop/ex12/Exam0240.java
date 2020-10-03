package oop.ex12;

public class Exam0240 {

	static abstract class Player {
		public abstract void play();
	}
	
	public static void main(String[] args) {
		Player p = () -> System.out.prinln("Player...");
		p.play();
		// 인터페이스가 아닌 추상클래스는 람다문법 구현 대상이 아니다.
	}
}
