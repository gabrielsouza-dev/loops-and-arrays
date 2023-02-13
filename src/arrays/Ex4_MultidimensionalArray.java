package arrays;
/*
Generate and print a 4x4 M matrix with random values between 0-9.
 */

import java.util.Random;

public class Ex4_MultidimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int l = 0; l < M.length; l++) {
            for(int c = 0; c < M[l].length; c++) {
                M[l][c] = random.nextInt(9);
            }
        }

        System.out.println("Matrix: ");
        for (int[] line : M) {
            for (int column : line) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
