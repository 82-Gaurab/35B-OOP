package Week6;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        // 1. Write a java program to Add two 2x3 matrices
        int[][] m1 = { { 1, 2, 3 }, { 5, 6, 7 } };
        int[][] m2 = { { 1, 2, 3 }, { 1, 2, 3 } };

        int[][] sum = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));

        // 2. Write a java program to print transpose 2X2 matrices
        int[][] m3 = { { 1, 2 }, { 3, 4 } };
        int[][] transpose = new int[2][2];
        System.out.println("Original matrix: " + Arrays.deepToString(m3));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = m3[j][i];
            }
        }
        System.out.println("Transpose : " + Arrays.deepToString(transpose));

        // 3. Write a java program to print mirror 2X2 matrices
        int[][] mirroredMatrix = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            mirroredMatrix[i][0] = m3[i][1];
            mirroredMatrix[i][1] = m3[i][0];
        }
        System.out.println("Mirrored matirx:\n"+Arrays.deepToString(mirroredMatrix));
    }
}
