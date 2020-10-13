package com.eomcs.design_pattern.observer.test;

public abstract class AbstractCarObserver implements CarObserver {
	@Override
	public void CarStarted() {}
	@Override
	public void CarStopped() {}
}
