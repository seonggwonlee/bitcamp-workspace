package com.eomcs.GodofJava;

public class Car {

  int speed;

  public Car() {

  }

  public void speedUp() {
    speed = speed + 5;
  }

  public void brakeDown() {
    speed = speed - 10;
  }

  public int getCurrentSpeed() {
    return speed;
  }
}
