package Week2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        String result =  (age >= 18) ? "You are elegible to vote." : "You are not eligible to vote.";
        System.out.println(result);
        scan.close();
    }
}
