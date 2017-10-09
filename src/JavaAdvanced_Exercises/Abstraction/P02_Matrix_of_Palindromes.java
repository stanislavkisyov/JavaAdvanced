package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P02_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int row1 = Integer.parseInt(input[0]);
        int col1 = Integer.parseInt(input[1]);

        char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[][] matrix = new String[row1][col1];

        fillMatrix(matrix, letter);
        printMatrix(matrix);

    }
    private static void fillMatrix (String[][] matrix, char[] letter){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.format("%s%s%s",letter[row], letter[row + col], letter[row]);
            }
        }
    }

    private static void printMatrix(String[][] matrix){
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
