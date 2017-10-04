package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P01_Read_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next("\\w+");
        String secondtWord = scanner.next("\\w+");
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        scanner.nextLine();
        String thirdWord = scanner.nextLine();
        int sum = firstInt + secondInt + thirdInt;

        System.out.println(firstWord + " " + secondtWord+ " " + thirdWord + " " + sum);
    }
}
