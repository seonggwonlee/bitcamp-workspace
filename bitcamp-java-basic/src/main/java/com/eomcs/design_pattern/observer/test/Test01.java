package com.eomcs.design_pattern.observer.test;

public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new BrakeOilCarObserver());
    
    car.start();

    car.run();

    car.addCarObserver(new SunRoofCloseCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.stop();
  }

}


