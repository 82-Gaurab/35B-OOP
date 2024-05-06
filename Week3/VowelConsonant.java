package Week3;

import java.util.Scanner;

public class VowelConsonant {
    /* input any alphabet and check whether it is vowel or consonant */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        char alpha = scan.next().charAt(0);
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ) {
            System.out.printf("%s is vowel.",alpha);
        }
        else{
            System.out.printf("%s is consonant.",alpha);
        }

        scan.close();

    }
}