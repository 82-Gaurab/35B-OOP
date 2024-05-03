package Week2;

import java.util.Scanner;

public class Q3 {
    //Calculate, area of the triangle, and the Volume of the Cube and Cuboid. 
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter length of base:");
        int base = triangle.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = triangle.nextInt();
        float area = (base*height)/2;
        System.out.println("The area of tirangle is: "+area); 
    }   
}
