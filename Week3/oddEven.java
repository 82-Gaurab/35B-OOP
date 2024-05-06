package Week3;

import java.util.Scanner;

public class oddEven {
    /* check whether a number is even or odd. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        if(num%2==0){
            System.out.printf("%d is even.",num);          
        }
        else{
            System.out.printf("%d is odd.",num);
        }
   
   
    }
}
