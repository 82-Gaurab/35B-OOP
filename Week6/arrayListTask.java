package Week6;

import java.util.ArrayList;
import java.util.Collections;

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

        // 2. WAP to sort the integer elements of array of size 10 in ascending and
        // descending order using ArrayList.
        ArrayList<Integer> element = new ArrayList<>();
        Collections.addAll(element, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int n = element.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (element.get(j) > element.get(j + 1)) {
                    // Swap element[j] and element[j+1]
                    int temp = element.get(j);
                    element.set(j, element.get(j + 1));
                    element.set(j + 1, temp);
                }
            }
        }
        System.out.println("In Ascending Order:\n" + element);

        Collections.sort(element, Collections.reverseOrder());
        System.out.println("In Descending Order:\n" + element);

    }
}
