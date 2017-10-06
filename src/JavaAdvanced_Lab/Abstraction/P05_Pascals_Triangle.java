package JavaAdvanced_Lab.Abstraction;

import java.util.Scanner;

public class P05_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());

        long[][] pascal = new long[height][height];

        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            pascal[currentHeight][0] = 1;
            pascal[currentHeight][currentHeight] = 1;
            if (currentHeight > 1) {
                for (int i = 1; i < currentHeight; i++) {
                    long[] previousRows = pascal[currentHeight - 1];
                    long previousRowsSum = previousRows[i] + previousRows[i - 1];
                    pascal[currentHeight][i] = previousRowsSum;
                }
            }
        }
        for (long[] longs : pascal) {
            for (long aLong : longs) {
                if (aLong > 0) {
                    System.out.print(aLong + " ");
                }
            }
            System.out.println();
        }
    }
}
