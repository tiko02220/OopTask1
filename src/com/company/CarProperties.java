package com.company;

class CarProperties {
    String model;
    int price;

    public void stop() {
        System.out.println(model + " was stopped");
    }

    public void start() {
        System.out.println(model + " started");
    }

    public void move() {
        System.out.println(model + " is moving ");
    }
}
