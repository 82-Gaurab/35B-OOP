package Week2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter marks of four subject oop, database, architecture and creative: ");
        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int percent = (sub1+sub2+sub3+sub4)/4;
        
        String result = (percent >= 70) ? "First Class"
                      : (percent > 59) ? "Upper Second Class"
                      : (percent > 49) ? "Second Class"
                      : (percent > 39) ? "Third Class"
                      : "Fail";

        System.out.println("percent: " + percent + "%");
        System.out.println("Result: " + result);

        scan.close();
    }
}
