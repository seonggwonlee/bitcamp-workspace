package com.eomcs.design_pattern.observer.test;

public class EngineOilCarObserver extends AbstractCarObserver {
	@Override
	public void CarStarted() {
		System.out.println("출발 전 엔진오일 검사");
	}
}
