package array;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        new RotateImage().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void rotate(int[][] matrix) {

        transpose(matrix);

        for (int i = 0; i < matrix.length; i++) {
            reverseRow(matrix, i);
        }

    }

    void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    void reverseRow(int[][] matrix, int rowNum) {
        int[] row = matrix[rowNum];

        int i = 0, j = row.length - 1;

        while (i < j) {
            int temp = row[i];
            row[i++] = row[j];
            row[j--] = temp;
        }

    }

}
