package Week2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Calculate SI
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principle amount:");
        int principleAmount = scan.nextInt();
        System.out.println("Enter rate of interest:");
        int rate = scan.nextInt();
        System.out.println("Enter time:");
        int time = scan.nextInt();
        double SI = (principleAmount *rate*time)/100;
        System.out.println("Simple interest is:"+SI);
    }
}
