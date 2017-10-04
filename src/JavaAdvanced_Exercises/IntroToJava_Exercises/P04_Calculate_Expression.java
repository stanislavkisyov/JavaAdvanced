package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.util.Scanner;

public class P04_Calculate_Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double result1 = Math.pow(((Math.pow(num1, 2) + Math.pow(num2, 2))) /
                (Math.pow(num1, 2) - Math.pow(num2, 2)), (num1 + num2 + num3) / Math.sqrt(num3));

        double result2 = Math.pow((Math.pow(num1, 2) + Math.pow(num2, 2) - Math.pow(num3, 3)), num1 - num2);

        double diff = Math.abs(((num1 + num2 + num3) / 3) - (result1 + result2) / 2);


        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", result1, result2, diff);
    }
}
