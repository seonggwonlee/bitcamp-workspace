package com.eomcs.GodofJava;

public class CarManager {

    public static void main(String[] args) {
      Car dogCar = new Car();
      Car cowCar = new Car();

      dogCar.speedUp();
      dogCar.speedUp();
      System.out.println(dogCar.getCurrentSpeed());
      dogCar.brakeDown();
      System.out.println(dogCar.getCurrentSpeed());

    }
}
