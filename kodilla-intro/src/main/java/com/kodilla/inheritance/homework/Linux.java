package com.kodilla.inheritance.homework;
public class Linux extends OperatingSystem {
   public Linux() {
       super:(year:1968);
   }
    @Override
    public void turnON() {
       System.out.println("Linux": is turned on ");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux": is turned off ");
    }
}
