package com.dcat.interviewprep.oop.inheritance;

// Parent class (superclass)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}
