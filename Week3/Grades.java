package Week3;

import java.util.Scanner;

public class Grades {
    /* takes a student's grade as input (A, B, C, D, or F) and 
    converts it to the corresponding GPA value */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String grade = scan.next();
        String c = grade.toUpperCase();
        switch (c) {
            case "A":
                System.out.println("your GPA is 4.0.");
                break;

            case "B":
                System.out.println("Your GPA is 3.0.");
                break;
            
            case "C":
                System.out.println("Your GPA is 2.0.");
                break;
            
            case "D":
                System.out.println("Your GPA is 1.0.");
                break;
            
            case "F":
                System.out.println("Your GPA is 0.0.");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }

        scan.close();



    }
}
