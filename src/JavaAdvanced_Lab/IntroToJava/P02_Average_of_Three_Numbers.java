package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P02_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondtNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();
        double sum =firstNum + secondtNum + thirdNum;
        System.out.printf("%.2f", sum / 3);
    }
}
