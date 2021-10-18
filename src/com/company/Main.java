package com.company;
public class Main {
    public static void main(String[] args) {
Driver Driver1 = new Driver("Bob",20);
Driver1.drive();
Car car1 = new Car("BMW",1000);
car1.start();
car1.move();
car1.stop();
    }
}
class DriverProperties{
    String name ;
    int age ;
    public void drive() {
        System.out.println(name + " is Driving");
    }

}
class CarProperties{
    String model ;
    int price;
    public void stop(){
        System.out.println(model + " was stopped");
    }
    public void start(){
        System.out.println(model + " started");
    }
     public void move  (){
    System.out.println(model + " is moving ");
    }
}
class Car extends CarProperties{
Car (String model ,int price){
    this.model =model;
    this.price = price;
    }
  }
class Driver extends DriverProperties{
    Driver(String name, int age){
        this.name =name; this.age= age;
    }
}