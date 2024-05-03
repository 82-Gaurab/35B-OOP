package Week2;

import java.util.Scanner;

public class Q5 {
    //to take two integer inputs from the user and print the sum and product of them
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter another integer: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        int product = num1*num2;
        System.out.println("The sum is "+sum +"\nthe product is "+product);
        scan.close();
    }
}
