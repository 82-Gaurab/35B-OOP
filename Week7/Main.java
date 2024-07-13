package Week7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Area of Circle: " + circle.areaOfCirlce());
        System.out.println();

        SimpleInterest SI = new SimpleInterest();
        SI.setPrinciple(2);
        SI.setRate(4);
        SI.setTime(5);
        System.out.println("Principle: "+SI.getPrinciple());
        System.out.println("Rate: "+SI.getRate());
        System.out.println("Time: "+SI.getTime());
    }
}

// 1. Write a Java program to create a class called "Circle" with a radius
// attribute. You can access this attribute using setter and getter method.
// Calculate the area and circumference of the circle.

class Circle {
    private int radius;

    public int getRadius() { // Getter Method
        return this.radius;
    }

    public void setRadius(int radius) { // Setter Method
        this.radius = radius;
    }

    public double areaOfCirlce() {
        double area = Math.PI * 2 * radius;
        return area;
    }
}

// 2. Write a Java program to create a class called “Simple Interest” with a
// data fields principle, time and rate, using setter getter method and print
// the values.

class SimpleInterest {
    private int principle;
    private int time;
    private int rate;

    public void setPrinciple(int principle) {
        this.principle = principle;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPrinciple() {
        return principle;
    }

    public int getTime() {
        return time;
    }

    public int getRate() {
        return rate;
    }

}