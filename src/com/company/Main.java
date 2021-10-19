package com.company;

public class Main {
    public static void main(String[] args) {
        Driver Driver1 = new Driver("Bob", 20);
        Driver1.drive();
        Car car1 = new Car("BMW", 1000);
        car1.start();
        car1.move();
        car1.stop();
    }
}

