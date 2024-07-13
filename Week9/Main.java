package Week9;

public class Main {
    public static void main(String[] args) {
        // Instance of Car
        Car c = new Car("Ford", "Mustang", "White", 2020);
        c.display();
        System.out.println();

        // Instance of HR Manager
        HRManager hr = new HRManager();
        hr.work();
        System.out.println();

        // Instance of Classes of shapes
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculateArea();

        Squares squares = new Squares(3);
        squares.calculateArea();

        Circles circles = new Circles(7);
        circles.calculateArea();
        System.out.println();

        // Instance of Classes of Book
        FictionBook fBook = new FictionBook("Wizard of OZ", "Joe");
        NonFictionBook nBook = new NonFictionBook("Steve Jobs", "Steve jobs");
        TechnicalBook tBook = new TechnicalBook("Data Science and Algorithm", "Bob");

        fBook.displayDetails();
        nBook.displayDetails();
        tBook.displayDetails();
    }
}
