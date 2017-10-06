package JavaAdvanced_Lab.Abstraction;

import java.util.Scanner;

public class P03_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int row1 = Integer.parseInt(input[0]);
        int col1 = Integer.parseInt(input[1]);

        int[][] matrix = new int[row1][col1];
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] num = scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(num[col]);
                sum += matrix[row][col];
            }
        }
        System.out.println(row1);
        System.out.println(col1);
        System.out.println(sum);
    }
}
