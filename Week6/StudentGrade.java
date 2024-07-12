package Week6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGrade {
    public static void main(String[] args) {
        // 2. Develop a simple menu-driven student grading system program in Java that
        // operates on an array of student grades. The program will display a Menu with
        // those options and prompt the user to choose his/her option.

        Boolean terminate = true;
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("1.  Add an element to the array\r\n" +
                "2.  Display all the elements of the array\r\n" +
                "3.  Reverse the elements of the array\r\n" +
                "4.  Find the largest element of the array\r\n" +
                "5.  Find the smallest element of the array\r\n" +
                "6.  Exit the program");

        while (terminate) {
            System.out.println();
            System.out.println("Input: ");
            int input = scan.nextInt();
            int element;
            switch (input) {
                case 1:
                    System.out.println("Enter the element you want to add: ");
                    element = scan.nextInt();
                    grades.add(element);
                    break;

                case 2:
                    System.out.println("Displaying all element:");
                    for (int e : grades) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    Collections.reverse(grades);
                    System.out.println("Reversed: ");
                    for (int e : grades) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Largest value: " + Collections.max(grades));
                    break;

                case 5:
                    System.out.println("Smallest value: " + Collections.min(grades));
                    break;

                case 6:
                    terminate = false;
                    break;
            }

        }
        scan.close();

    }
}
