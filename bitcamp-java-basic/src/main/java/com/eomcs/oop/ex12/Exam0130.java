package oop.ex12;

public class Exam0130 {

	interface Player {
		void play(String name);
	}
	
	public static void main(String[] args) {
		Player p1 = (String name) -> {
			System.out.println(name + "님, 환영합니다.");
		};
		p1.play("홍길동");
		// 파라미터 선언은 괄호 안에
		
		Player p2 = (name) -> System.out.println(name + "님, 환영합니다.");
		p2.play("유관순");
		// 파라미터 타입 생략 가능
		
		Player p3 = name -> System.out.println(name + "님, 환영합니다.");
		p3.play("장보고");
		// 파라미터가 한 개일 땐 괄호도 생략 가능
				
	}
}
