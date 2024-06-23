package Week4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width:");
        int width = scan.nextInt();
        for ( int i = 0; i< width;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
