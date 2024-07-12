package Week6;
import java.util.ArrayList;

public class arrayListTask {
    public static void main(String[] args) {
        // 1. Write code that creates an ArrayList that can hold string objects.
        // Add the names of three cars to the ArrayList, and then display the contents
        // of the ArrayList.

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");

        System.out.println(cars);
    }
}
