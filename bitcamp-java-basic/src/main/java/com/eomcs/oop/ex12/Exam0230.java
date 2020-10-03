package oop.ex12;

public class Exam0230 {

	interface Player {
		static String info() {
			return "Player입니다.";
		}
		
		default void stop() {
			
		}
		
		void play();
	}
	
	public static void main(String[] args) {
		Player p = () -> System.out.println("Player..");
		p.play();
		System.out.println(Player.info());
	}
	// 인터페이스에 메서드가 여러 개라도 '추상'메서드가 1개라면 람다문법 구현 가능
}
