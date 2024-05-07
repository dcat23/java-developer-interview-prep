package com.dcat.interviewprep.oop.abstraction;

public class Example {
    public static void main(String[] args) {
        // Using abstraction through abstract class
        Vehicle car = new Car();
        car.start();
        car.stop();

        System.out.println();

        // Using abstraction through interface
        Flying airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}