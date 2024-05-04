package Week2;

import java.util.Scanner;

/*Take side of a square from user and print area and perimeter of it. 
Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
Take the attributes as user input. */

public class Q8 {
    public static void main(String[] args) {

        //Area and Perimeter of Square
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of side: ");
        int side = scan.nextInt();
        int area = side*side;
        int perimeter = 4 *side;
        System.out.printf("The area is %d and the perimeter is %d",area,perimeter);

        //Simple Interest
        System.out.println("Enter Principle amount:");
        int principleAmount = scan.nextInt();
        System.out.println("Enter rate of interest:");
        int rate = scan.nextInt();
        System.out.println("Enter time:");
        int time = scan.nextInt();
        double SI = (principleAmount *rate*time)/100;
        System.out.println("Simple interest is:"+SI);

        //Area of triangle
        System.out.println("Enter length of base:");
        int base = scan.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = scan.nextInt();
        float areaTriangle = (base*height)/2;
        System.out.println("The area of tirangle is: "+areaTriangle); 

        //Volume of Cuboid
        System.out.print("Enter length of cuboid: ");
        int len = scan.nextInt();
        System.out.print("Enter breadth of cuboid: ");
        int breadth = scan.nextInt();
        System.out.print("Enter height of cuboid: ");
        int heightCuboid = scan.nextInt();
        int volumeCuboid = len*breadth*heightCuboid;
        System.out.println("Volume of cuboid is "+ volumeCuboid);
        
        //Volume of Cube
        System.out.print("Enter lengthof cube:");
        int length = scan.nextInt();
        int volumeCube = length*length*length;
        System.err.println("Volume of cube is "+volumeCube);
        
        scan.close();
    }
}
