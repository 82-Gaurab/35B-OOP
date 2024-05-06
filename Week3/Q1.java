package Week3;

import java.util.Scanner;

public class Q1 {
    /* find the maximum between three numbers. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 & num1>num3) {
                System.out.println(num1+" is the maximum.");
        }
        else if (num2>num1 & num2>num3) {
            System.out.println(num2+" is the maximum.");
        }
        else{
            System.out.println(num3+" is the maximum.");
        }
        scan.close();
    }
}
