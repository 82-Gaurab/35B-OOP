package Week9;

public class Vehicle {
    // 1. Write a Java program to create a class called Vehicle with a method called
    // drive(). Create a subclass called Car with method display() method to print
    // details of the Car.

    String name;
    String model;
    int manufactured_date;
    String color;

    public void drive() {
        System.out.println("Driving the vehicle.");
    }
}

class Car extends Vehicle {

    Car(String name, String model, String color, int manufactured_date) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.manufactured_date = manufactured_date;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Manufactured date: " + this.manufactured_date);
    }
}
