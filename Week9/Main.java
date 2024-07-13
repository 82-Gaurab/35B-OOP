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
    }
}
