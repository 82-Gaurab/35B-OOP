package Week7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Area of Circle: "+circle.areaOfCirlce());
    }
}

// 1. Write a Java program to create a class called "Circle" with a radius
// attribute. You can access this attribute using setter and getter method.
// Calculate the area and circumference of the circle.

class Circle{
    private int radius;

    public int getRadius(){    // Getter Method 
        return this.radius;
    }

    public void setRadius(int radius){   // Setter Method
        this.radius = radius;
    }

    public double areaOfCirlce(){
        double area = Math.PI *2*radius;
        return area;
    }
}