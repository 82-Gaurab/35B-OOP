package Week4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.next();

        for (int i = 0;i<5;i++){
            System.out.print("Hello" + name);
        }

    }
}