package com.kodilla.inheritance.homework;

public class WindowsTen  extends OperatingSystem{
    public WindowsTen(){
        super(year:2012);
    }
    @Override
    public void turnON() {
        System.out.println("Windows 10: is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows 10: is turned off");
    }
}
