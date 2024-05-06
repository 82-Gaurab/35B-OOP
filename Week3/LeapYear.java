package Week3;

import java.util.Scanner;

public class LeapYear {
    /*check whether a year is a leap year or not */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        if (year % 4==0) {
            System.out.printf("%d is leap year.",year);
        }

        else{
            System.out.printf("%d is not a leap year.",year);
        }

        scan.close();



    }
}
