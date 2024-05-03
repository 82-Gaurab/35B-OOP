package Week2;

import java.util.*;

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
        triangle.close();

        // Volume of cube
        Scanner cube = new Scanner(System.in);
        System.out.print("Enter length:");
        int length = cube.nextInt();
        int volumeCube = length*length*length;
        System.err.println("Volume of cube is "+volumeCube);
        cube.close();

        //Volume of cuboid
        Scanner cuboid = new Scanner(System.in);
        System.out.print("Enter length of cuboid: ");
        int len = cuboid.nextInt();
        System.out.print("Enter breadth of cuboid: ");
        int breadth = cuboid.nextInt();
        System.out.print("Enter height of cuboid: ");
        int heightCuboid = cuboid.nextInt();
        int volumeCuboid = len*breadth*heightCuboid;
        System.out.println("Volume of cuboid is "+ volumeCuboid);
        cuboid.close();
    }   
}
