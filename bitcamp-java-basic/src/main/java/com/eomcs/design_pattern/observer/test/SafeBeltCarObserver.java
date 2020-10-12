package com.eomcs.design_pattern.observer.test;

public class SafeBeltCarObserver extends AbstractCarObserver {
	@Override
	public void CarStarted() {
		System.out.println("출발 전 벨트 확인 여부 검사");
	}
}
