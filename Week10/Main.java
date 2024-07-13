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
        System.out.println();

        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
        System.out.println();

        Cuboid cuboid = new Cuboid(10, 6, 5);
        System.out.println("The Area of cuboid: "+cuboid.calculateArea());
        System.out.println("The Perimeter of cuboid: "+cuboid.calculatePerimeter());
        System.out.println("The volume of cuboid: "+cuboid.calculateVolume());

        Cube cube = new Cube(5);
        System.out.println("The area of cube: "+cube.calculateArea());
        System.out.println("The Perimeter of cube: "+cube.calculatePerimeter());
        System.out.println("The Voulume of cube: "+cube.calculateVolume());

        Cylinder cylinder = new Cylinder(7, 10);
        System.out.println("The area of cylinder: "+cylinder.calculateArea());
        System.out.println("The Perimeter of cylinder: "+cylinder.calculatePerimeter());
        System.out.println("The Voulume of cylinder: "+cylinder.calculateVolume());

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

// 3. Create an abstract class called Vehicle with abstract methods
// startEngine() and stopEngine(). Implement two subclasses called Car and
// Motorcycle that inherit from Vehicle. Implement the startEngine() and
// stopEngine() methods in both subclasses to start and stop the engines of a
// car and a motorcycle, respectively.

abstract class Vehicle {
    abstract void startEngine();

    abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine has started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine has stopped");
    }

}

class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine has started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine has stopped");
    }

}

// Q5. Abstract class Draw and Create subclasses for different shapes such as
// "Cube," "Cuboid," and "Cylinder."

abstract class Draw {
    abstract double calculateVolume();

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Cuboid extends Draw{

    int length;
    int breadth;
    int height;

    Cuboid(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length*breadth*height;
    }

    @Override
    double calculateArea() {
        return 	2*(length*breadth + breadth*height + height*length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length+breadth+height);
    }
    
}

class Cube extends Draw{

    int length;

    Cube(int length){
        this.length = length;
    }

    @Override
    double calculateVolume() {
        return length*length*length;
    }

    @Override
    double calculateArea() {
        return 6*length*length;
    }

    @Override
    double calculatePerimeter() {
        return 6*length;
    }

}

class Cylinder extends Draw{

    int radius;
    int height;

    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    double calculateArea() {
        return 2* Math.PI *radius *height + 2* Math.PI *radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return (4*radius + 2*height);
    }
    
}