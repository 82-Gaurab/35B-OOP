package Week2;

import java.util.Scanner;

public class Q7 {
    /*Take the name, roll number, and field of interest from the user and print in the format below:
     Hey, my name is XYZ and my roll number is XYZ.
     My field of interest are xyz. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Enter your roll no: ");
        int roll = scan.nextInt();
        System.out.println("Enter your field of interest: ");
        String interest = scan.nextLine();
        System.out.println("Hey, my name is "+name+ " and my roll number is "+ roll+".");
        System.out.println("My field of interest are "+interest);
        scan.close();
    }
}
