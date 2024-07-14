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