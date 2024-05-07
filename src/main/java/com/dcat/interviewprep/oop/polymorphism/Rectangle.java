package com.dcat.interviewprep.oop.polymorphism;

// Subclass 1: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding: calculate area for rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}
