package com.kodilla.collections.interfaces.homework;

public class Honda implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed += 17;
    }

    @Override
    public void decreaseSpeed() {
    speed -= 20;
    }
}
