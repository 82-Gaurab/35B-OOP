package Week10;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
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