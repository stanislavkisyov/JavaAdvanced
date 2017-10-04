package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.util.Scanner;

public class P07_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();
        scanner.nextLine();

        int sum = 0;
        String maxLength = "";
        String minLength = "";
        
        if (firstWord.length() > secondWord.length()) {
            maxLength = firstWord;
            minLength = secondWord;
        } else {
            maxLength = secondWord;
            minLength = firstWord;
        }
        for (int i = 0; i < minLength.length(); i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }
        for (int i = minLength.length(); i <= maxLength.length() - 1; i++) {
            sum += maxLength.charAt(i);
        }


        System.out.println(sum);
    }
}
