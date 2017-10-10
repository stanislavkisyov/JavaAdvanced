package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P05_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];
        int bestSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        fillMatrix(matrix, scanner);

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum > bestSum) {
                    bestSum = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println("Sum = " + bestSum);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }
    }
}
