package Week3;

import java.util.Scanner;

public class divisible {
    /* check whether a number is divisible by 5 and 11 or not. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        if (num %5 ==0 & num % 11 ==0) {
            System.out.printf("%d is divisible by 5 and 11.",num);
        }
        else{
            System.out.printf("%d is not divisible by 5 and 11.",num);
        }

        
    }
}
