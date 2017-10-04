package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.util.Scanner;

public class P01_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sidaA = scanner.nextDouble();
        double sidaB = scanner.nextDouble();
        double sum = sidaA * sidaB;
        System.out.printf("%.2f", sum);
    }
}
