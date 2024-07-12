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

        // 2. Write a Java program to test if an array contains a specific value.
        int[] ar1 = { 9, 8, 7, 6, 5, 4, 3 };
        int x = 6;
        boolean contain = false;
        for (int i : ar1) {
            if (i == x) {
                contain = true;
                break;
            } else {
                contain = false;
            }
        }
        if (contain) {
            System.out.println("The array contains the value.");
        } else {
            System.out.println("The array does not contain the value.");
        }

        // 3. Write a Java program to find the maximum and minimum value of an array.
        int max = ar1[0];
        for (int i : ar1) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum: " + max);
        for (int i : ar1) {
            if (i < max) {
                max = i;
            }
        }
        System.out.println("Minimum: " + max);
    }
}
