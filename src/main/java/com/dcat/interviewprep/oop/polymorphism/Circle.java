package com.dcat.interviewprep.oop.polymorphism;


// Subclass 2: Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method overriding: calculate area for circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}