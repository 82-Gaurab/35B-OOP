import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the shape:");
        String shape = scan.next();
        switch (shape) {
            case "rectangle":
            System.out.println("Enter length and breadth in decimal: ");
            double leng = scan.nextDouble();
            double bread = scan.nextDouble();
            double arear = leng*bread;
            int arearTypeCasted = (int) arear;
            System.out.println("Typecasted area of rectangle is "+ arearTypeCasted);
            break;

            case "square":
            System.out.println("Enter length of square: ");
            int le = scan.nextInt();
            System.out.println("Area of sq: "+le*le);
            break;

            case "triangle":
            System.out.println("Enter base and height: ");
            int base = scan.nextInt();
            int height = scan.nextInt();
            System.out.println("Area of triangle: "+base*height/2);
            break;

            case "circle":
            System.out.println("Enter the radius of the circle: ");
            double r = scan.nextDouble();
            System.out.println("The area of the circle is "+(Math.PI*r*r));
            break;
        
            default:
                break;
    }
    scan.close();
}
}
