package array;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        new SetMatrixZeros().setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] == true || cols[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
