package Week2;

import java.util.Scanner;

public class Q6 {
    /*Take two integer inputs from the user. First, calculate the sum of two, then the product of two.
     Finally, calculate the division of the thus obtained sum and product and print the result. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter another integer: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        int product = num1*num2;
        int result = product/sum;
        System.out.println("The result is "+result);
        scan.close();
    }
}
