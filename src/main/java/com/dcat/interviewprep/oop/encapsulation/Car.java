package com.dcat.interviewprep.oop.encapsulation;

/**
 *  Encapsulation example
 */
public class Car {
    // Private variables (attributes) are encapsulated
    private String model;
    private String color;
    private int year;

    // Constructor to initialize the Car object
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getter methods to access the private variables (encapsulation)
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    // Setter methods to modify the private variables (encapsulation)
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota Camry", "Red", 2020);

        // Accessing attributes using getter methods (encapsulation)
        System.out.println("My car details:");
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Year: " + myCar.getYear());

        // Modifying attributes using setter methods (encapsulation)
        myCar.setColor("Blue");
        myCar.setYear(2021);

        // Displaying updated information
        System.out.println("\nUpdated car details:");
        myCar.displayInfo();
    }
}
