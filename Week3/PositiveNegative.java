package Week3;

import java.util.Scanner;

public class PositiveNegative {
    /* check whether a number is negative, positive, or zero. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        if (number>0) {
            System.out.println("The given number is positive.");
        }
        else if (number<0) {
            System.out.println("The given number is negative.");
        }
        else{
            System.out.println("The given number is zero.");
        }


    }
}
