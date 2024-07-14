package Week11;

public class Main {
    public static void main(String[] args) {
        // Q1 shape drawing application
        Rectangles r = new Rectangles(5, 7);
        r.calculateArea();

        Circles circles = new Circles(9);
        circles.calculateArea();

        Triangles triangles = new Triangles(2, 7);
        triangles.calculateArea();
        System.out.println();

        // Q2 payment methods
        creditCard card = new creditCard();
        card.validation();
        card.transaction();

        PayPal pal = new PayPal();
        pal.validation();
        pal.transaction();

        bankTransfer bank = new bankTransfer();
        bank.validation();
        bank.transaction();
        System.out.println();

        // Q3 rental system
        car C = new car();
        C.rent();

        motorcycles MC = new motorcycles();
        MC.rent();

        bicycles b = new bicycles();
        b.rent();
    }

}

// 1. You are developing a shape drawing application. There are different types
// of shapes such as circles, rectangles, and triangles. Each shape has its own
// area calculation method. Implement a Java program using polymorphism to
// calculate and display the area of different shapes.

abstract class Shape {
    abstract void calculateArea();
}

class Circles extends Shape {
    private int radius;

    Circles(int radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle: " + 2 * Math.PI * radius);
    }
}

class Rectangles extends Shape {

    private int length;
    private int breadth;

    Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }

}

class Triangles extends Shape {

    private int base;
    private int height;

    Triangles(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of triangle: " + base * height * 0.5);
    }
}

// Q2. E commerce application
abstract class Payment {
    abstract void validation();

    abstract void transaction();
}

class creditCard extends Payment {

    @Override
    void transaction() {
        System.out.println("Transaction is made");

    }

    @Override
    void validation() {
        System.out.println("Credit card is valid.");

    }

}

class PayPal extends Payment {

    @Override
    void transaction() {
        System.out.println("Transaction is made");

    }

    @Override
    void validation() {
        System.out.println("Pay pal is valid.");

    }

}

class bankTransfer extends Payment {

    @Override
    void transaction() {
        System.out.println("Transaction is made");

    }

    @Override
    void validation() {
        System.out.println("Bank Transfer is valid.");

    }

}

//  Q3. Car rental system

abstract class Vehicle{
    abstract void rent();
}

class car extends Vehicle {

    @Override
    void rent() {
        System.out.println("Cost for renting a car is 10000");
    }
    
}
class motorcycles extends Vehicle {

    @Override
    void rent() {
        System.out.println("Cost for renting a motocycles is 6000");
    }
    
}
class bicycles extends Vehicle {

    @Override
    void rent() {
        System.out.println("Cost for renting a bicycles is 3000");
    }
    
}