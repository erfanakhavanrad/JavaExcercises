package com.company.Inheriteace;

public class Porsche extends Car {

  public static void steering(String direction) {
    System.out.println("steering to the " + direction);
  }

  public static void changeGear(int gear) {
    System.out.println("gear changed to " + gear);
  }

  public static void moving(int speed) {
    System.out.println("moving at " + speed);
  }

}
