package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    private int speed;

    @Override
    public int getSpeed() {

        return speed ;
    }

    @Override
    public void increaseSpeed() {

        speed += 13;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 18;
    }
}
