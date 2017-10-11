package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P06_Sequence_in_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[][] matrix = new String[n][m];

        fillMatrix(scanner, matrix);

        int bestCount = 1;
        String element = "";

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
               String currentElement = matrix[row][row];
                if ( currentElement.length() > bestCount) {
                    bestCount = currentElement.length();
                    element = matrix[row][row];
                }
            }
        }
        for (int i = 0; i < bestCount; i++) {
            System.out.print(element + " ");
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = reminder[col];
            }
        }
    }
}
