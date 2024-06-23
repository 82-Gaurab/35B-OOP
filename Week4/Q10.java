package Week4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int fornum = scan.nextInt();
        int add=0;
        for(int i=1; i<=fornum; i++){
            add+=i;
        }
        System.out.println(add);
        scan.close();
    }
}
