package Week6;

public class oneDArray {
    public static void main(String[] args) {
        // 1. Write a Java program to calculate the average value of array element.
        int[] ar = { 1, 2, 3, 4, 5 };
        int count = 0;
        int sum = 0;
        for (int i : ar) {
            sum += i;
            count++;
        }
        float avg = sum / count;
        System.out.println(avg);
    }
}
