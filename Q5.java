import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        char yn;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter a positive non-zero integer: ");
            int x = scan.nextInt();
            int sum = 0;
            System.out.print("Sum from 1 to "+x+" is ");
            for(int i =1; i<=x; i++){
                sum+=i;
            }
            System.out.println(sum);
            System.out.println("Enter y to continue: ");
            yn = scan.next().charAt(0);
        }while(yn=='y');
    }
}
