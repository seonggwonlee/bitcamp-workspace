package oop.ex12;

public class Exam0312 {

	static interface Player {
		void play();
	}
	
	static void testPlayer(Player player) {
		player.play();
	}
	
	public static void main(String[] args) {
		testPlayer(() -> System.out.println("실행"));
	}
}
