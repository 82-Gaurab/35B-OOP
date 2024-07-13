package Week7;

public class Main {
    public static void main(String[] args) {
        // Instance of Circle
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Area of Circle: " + circle.areaOfCirlce());
        System.out.println();

        // Instance of Simple Interest
        SimpleInterest SI = new SimpleInterest();
        SI.setPrinciple(2);
        SI.setRate(4);
        SI.setTime(5);
        System.out.println("Principle: " + SI.getPrinciple());
        System.out.println("Rate: " + SI.getRate());
        System.out.println("Time: " + SI.getTime());
        System.out.println();

        // Instance of Dog
        Dog d1 = new Dog("BOB", "Retriver");
        Dog d2 = new Dog("Rocky", "Bulldog");

        d1.setName("Max");
        d1.setBreed("German Shephard");

        d2.setName("Charlie");
        d2.setBreed("Bulldog");

        System.out.println("Name of dog 1: "+d1.getName());
        System.out.println("Breed of dog 1: "+d1.getBreed());
        System.out.println("Breed of dog 2: "+d2.getName());
        System.out.println("Breed of dog 2: "+d2.getBreed());
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

// 3. Write a Java program to create a class called "Dog" with a name and breed
// attribute. Create two instances of the "Dog" class, set their attributes
// using the constructor and modify the attributes using the setter methods and
// print the updated values.
class Dog{
    private String name;
    private String breed;

    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}