package JavaAdvanced_Exercises.Abstraction;

import java.util.Scanner;

public class P02_1_Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        char one = 'a';
        char two = 'a';
        char three = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(one + "" + two + "" + three + " ");
                two++;
            }
            System.out.println();
            one++;
            two = one;
            three = one;
        }
    }
}
