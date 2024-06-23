package Week4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String stnum = scan.nextLine();
        char[]  rev= new char[stnum.length()];
        
        int j=0;
        for (int i = stnum.length() - 1; i >= 0; i--) {
            rev[j] = stnum.charAt(i);
            j++;
        }
        for(char i: rev){
            System.out.print(i);
        }
        scan.close();

    }
}
