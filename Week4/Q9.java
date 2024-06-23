package Week4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int greater=0;
        int equal=0;
        int lesser=0;
        int avgGreater = 0;
        int avgLesser = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter the number: ");
            int num = scan.nextInt();
            if(num>50){
                greater++;
                avgGreater += num;
            }
            else if(num<50){
                lesser++;
                avgGreater += num;
            }
            else{
                equal++;
            }
        }
        System.out.println("More than fifty: "+greater);
        System.out.println("Less than fifty: "+lesser);
        System.out.println("Equal than fifty: "+equal);
        System.out.println("Avg of more than fifty: "+(avgGreater/greater));
        System.out.println("Avg of less than fifty: "+(avgLesser/lesser));
    }
}
