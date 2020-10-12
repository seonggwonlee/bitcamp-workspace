package com.eomcs.design_pattern.observer.test;

public class BrakeOilCarObserver extends AbstractCarObserver {
	@Override
	public void CarStarted() {
		System.out.println("출발 전 브레이크 오일 검사");
	}
}
