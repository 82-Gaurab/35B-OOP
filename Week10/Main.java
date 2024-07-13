package Week10;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
        System.out.println();

        Rectangle rectangle = new Rectangle(4, 10);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.calculateArea());

    }
}

// 1. Create an abstract class called Animal with an abstract method called
// sound(). Implement two subclasses called Dog and Cat that inherit from
// Animal. Override the sound() method in both subclasses to display the
// specific sound made by each animal. Write the Java code to implement this
// scenario.

abstract class Animal {
    abstract void sound();
}

// Subclasses
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }

}

// 2. Create an abstract class called Shape with an abstract method called
// calculateArea(). Implement two subclasses called Rectangle and Circle that
// inherit from Shape. Override the calculateArea() method in both subclasses to
// calculate and return the area of a rectangle and a circle, respectively.
// Write the Java code to implement this scenario with Scanner Input.

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * 2 * radius;
    }
}