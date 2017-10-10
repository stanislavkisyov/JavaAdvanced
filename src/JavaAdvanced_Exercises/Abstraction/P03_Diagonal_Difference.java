package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        System.out.println(DiagonalDifference(matrix));
    }

    private static int DiagonalDifference(int[][] matrix) {
        int sum1 = 0;
        int sum2 = 0;

        for (int row = 0; row < matrix.length; row++) {
            sum1 += matrix[row][row];
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            sum2 += matrix[row][matrix.length - 1 - row];
        }
        int difference = Math.abs(sum1 - sum2);
        return difference;
    }
}
