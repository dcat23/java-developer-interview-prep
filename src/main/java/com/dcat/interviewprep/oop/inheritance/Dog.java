package com.dcat.interviewprep.oop.inheritance;

// Child class (subclass) inheriting from Animal
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Calling the superclass constructor
        super(name);
        this.breed = breed;
    }

    // Method to display additional information about the dog
    public void displayDogInfo() {
        // Calling the displayInfo() method of the superclass
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}