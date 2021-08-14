package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main (String [] args) {
    doRace(new Toyota());
    doRace(new Honda());
    doRace(new Fiat());
    }

    public static void doRace(Car car) {
        for (int n = 0; n < 3; n++) {
            car.increaseSpeed();
            for (int n = 0; n < 2; n++) {
                car.decreaseSpeed();
                System.out.println("Speed is equal to " + car.getSpeed());

    }
}
