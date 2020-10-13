package oop.ex12;

public class Exam0412 {
	static interface Interest {
		double compute(int money);
	}
	
	static Interest getInterest(final double rate) {
		Interest In = new Interest() {
			@Override
			public double compute(int money) {
				return money + (money * rate / 100);
			}
		};
		return In;
	}
	// 객체를 1개만 생성할 것이라면 익명 클래스로 정의한다.
	
	public static void main(String[] args) {
		Interest s1 = getInterest(1.5);
		System.out.printf("금액 : %.2f\n", s1.compute(1_0000_0000));
		
		Interest s2 = getInterest(2.5);
		System.out.printf("금액 : %.2f\n", s2.compute(1_0000_0000));
	}
}
