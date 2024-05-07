package com.dcat.interviewprep.oop.polymorphism;

public class Example {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        // Loop through shapes and calculate area
        for (Shape shape : shapes) {
            // Polymorphic method invocation
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}