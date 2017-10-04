package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P03_Formatting_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        String hexDecimal = Integer.toHexString(num1).toUpperCase();
        System.out.println();
        // ToDo: Има още за измисляне!!!
    }
}
