package JavaAdvanced_Lab.Abstraction;

import java.util.Scanner;

public class P05_1_Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        long pascalMatrix[][] = new long[height][];

        for (int i = 0; i < pascalMatrix.length; i++) {
            pascalMatrix[i] = new long[i + 1];
        }

        pascalMatrix[0][0] = 1;

        for (int row = 1; row < pascalMatrix.length; row++) {
            pascalMatrix[row][0] = 1;
            pascalMatrix[row][pascalMatrix[row].length - 1] = 1;
            for (int col = 1; col < pascalMatrix[row].length - 1; col++) {
                pascalMatrix[row][col] = pascalMatrix[row - 1][col - 1] + pascalMatrix[row - 1][col];


            }
        }
        for (long[] matrix : pascalMatrix) {
            for (long l : matrix) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }
}
