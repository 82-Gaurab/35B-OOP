package Week9;

public class Shape {

    // 3. Imagine you are building a geometry calculator program. You need to
    // implement the calculation of areas for different shapes, including
    // rectangles, squares, and circles. To achieve this, you decide to use a
    // multilevel inheritance hierarchy.

    int length;
    int breadth;
    int radius;

    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius){
        this.radius = radius;
    }
}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length,breadth);
    }

    void calculateArea(){
        int area = super.length * super.breadth;
        System.out.println("Area of rectangle: "+area);
    }
}

class Squares extends Rectangle{
    Squares(int length){
        super(length, length);
    }
    void calculateArea(){
        System.out.println("Area of square: "+this.length*this.length);
    }
}

class Circles extends Shape{

    Circles(int radius){
        super(radius);
    }

    void calculateArea(){
        System.out.println("Area of circle: "+ Math.PI*2*this.radius);
    }
}