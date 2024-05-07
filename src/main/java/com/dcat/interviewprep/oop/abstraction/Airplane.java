package com.dcat.interviewprep.oop.abstraction;


// Concrete class representing an Airplane
class Airplane implements Flying {
    @Override
    public void takeOff() {
        System.out.println("Airplane took off.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Airplane landed.");
    }
}
