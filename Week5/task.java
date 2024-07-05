// Package Week5;

public class task{

    // 1. Make a method to check if a number is prime or not.
    public static void prime(int num){
        int count =0;
        int i=1;
        while (num % i ==0) {
            count++;
            i++;           
        }
        if (count >1){
            System.out.printf("%d is not prime",num);
        }
        else{
            System.out.printf("%d is prime",num);
        }
    }

    public static void main(String[] args) {
        prime(13);
    }
}