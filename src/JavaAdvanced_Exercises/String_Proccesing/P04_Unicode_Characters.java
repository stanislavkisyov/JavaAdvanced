package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Scanner;

public class P04_Unicode_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        for (char c : input) {
            System.out.print("\\u" + Integer.toHexString(c |  0x10000).substring(1));
        }
    }
}
