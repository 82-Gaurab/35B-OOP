// Package Week5;

public class task {

    // 1. Make a method to check if a number is prime or not.
    public static void prime(int num) {
        int count = 0;
        int i = 1;
        while (num % i == 0) {
            count++;
            i++;
        }
        if (count > 1) {
            System.out.printf("%d is not prime\n", num);
        } else {
            System.out.printf("%d is prime\n", num);
        }
    }

    // 2. Make a method to check if a given number n is even or not.
    public static void even(int n) {
        if (n % 2 == 0) {
            System.out.printf("%d is even\n", n);
        } else {
            System.out.printf("%d is odd\n", n);
        }
    }

    // 3. Make a method to print the table of a given number n.
    public static void table(int n){
        for(int i = 1; i <=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i );
        }
    }

    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
    public static int multliplication(int num1,int num2, int num3){
        return num1*num2*num3;
    }

    public static void main(String[] args) {
        prime(12);
        even(7);
        table(5);
        System.out.println("The multliplication = "+ multliplication(3, 4, 10));
    }
}