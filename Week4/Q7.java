package Week4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int smallerNumber = Math.min(a, b);
        int hcf = 1;

        for (int i = 1; i <= smallerNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF : "+hcf);
    }
}
