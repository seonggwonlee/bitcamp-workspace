package com.eomcs.basic.oop.ex03;

class SmartPhone {

  int volume;
  int bright;
  int contrast;


  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨!");
  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone() 생성자 호출됨!");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }

public class Exam0424 {


  public static void main(String[] args) {
    SmartPhone obj1 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone();
  }
 }
}