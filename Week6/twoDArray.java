package Week6;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        // 1. Write a java program to Add two 2x3 matrices
        int[][] m1 = {{1,2,3},{5,6,7}};
        int[][] m2 = {{1,2,3},{1,2,3}};

        int[][] sum = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
    }
}
