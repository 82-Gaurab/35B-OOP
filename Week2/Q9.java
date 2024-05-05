import java.util.Scanner;

public class Q9 {
    //Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = scan.nextDouble();
        System.out.println("Enter breadth:");
        double breadth = scan.nextDouble();
        double area = length*breadth;
        int myArea = (int) area;
        System.out.println("Area: "+myArea);
        scan.close();
    }
}
