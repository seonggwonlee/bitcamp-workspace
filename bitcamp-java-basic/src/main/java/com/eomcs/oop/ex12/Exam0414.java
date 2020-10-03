package oop.ex12;

public class Exam0414 {
	static interface Interest {
		double compute(int money);
	}
	
	static Interest getInterest(final double rate) {	
		return (int money) -> money + (money * rate / 100);
	}
	// 람다 문법으로 구현체 구현
	
	public static void main(String[] args) {
		Interest s1 = getInterest(1.5);
		System.out.printf("금액 : %.2f\n", s1.compute(1_0000_0000));
		
		Interest s2 = getInterest(2.5);
		System.out.printf("금액 : %.2f\n", s2.compute(1_0000_0000));
	}
}
