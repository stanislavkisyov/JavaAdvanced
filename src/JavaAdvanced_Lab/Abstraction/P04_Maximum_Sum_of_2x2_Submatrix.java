package JavaAdvanced_Lab.Abstraction;

import java.util.Scanner;

public class P04_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rowsLength = Integer.parseInt(input[0]);
        int colsLength = Integer.parseInt(input[1]);

        int[][] matrix = new int[rowsLength][colsLength];

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col]
                        + matrix[row][col + 1]
                        + matrix[row + 1][col]
                        + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
        System.out.println(maxSum);
    }
}

