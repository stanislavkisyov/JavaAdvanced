package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P01_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String command = input[1];

        int[][] matrix = new int[size][size];
        int numbers = 1;
        if (command.equals("A")) {
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = numbers;
                    numbers++;
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i % 2 == 0) {
                        matrix[j][i] = numbers++;
                    } else {
                        matrix[matrix.length - 1 - j][i] = numbers++;
                    }
                }
            }
            }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
