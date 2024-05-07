package com.dcat.interviewprep.oop.abstraction;

// Concrete subclass representing a Car
class Car extends Vehicle {
    // Implementation of start method for Car
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    // Implementation of stop method for Car
    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
