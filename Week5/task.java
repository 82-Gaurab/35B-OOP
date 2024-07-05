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

    public static void main(String[] args) {
        prime(12);
        even(7);
    }
}