package Week3;

import java.util.Scanner;

public class Arithematic {
    /*
     * takes two numbers and an operator (+, -, *, /) as inputs
     * and performs the corresponding arithmetic operation using a switch case
     * statement
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print("Enter the operator: ");
        String operator = scan.next();

        scan.close();

        switch (operator) {
            case "+":
                int sum = num1 + num2;
                System.out.printf("%d + %d = %d", num1, num2, sum);
                break;

            case "-":
                int difference = num1 - num2;
                System.out.printf("%d - %d = %d", num1, num2, difference);
                break;

            case "*":
                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;

            case "/":
                float div = num1 / num2;
                System.out.printf("%d / %d = %d", num1, num2, div);
                break;

            default:
                System.out.println("Not a valid arithematic operator");
                break;
        }

    }
}
