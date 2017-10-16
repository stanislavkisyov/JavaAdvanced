package JavaAdvanced_Exercises.String_Proccesing;

import java.util.HashSet;
import java.util.Scanner;

public class P06_Magic_Exchangeable_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        String first = input[0];
        String second = input[1];

        HashSet<Character> firstSet = new HashSet<>();
        HashSet<Character> secondSed = new HashSet<>();

        for (int i = 0; i < first.length(); i++) {
            firstSet.add(first.charAt(i));
        }

        for (int i = 0; i < second.length(); i++) {
            secondSed.add(second.charAt(i));
        }

        System.out.println(firstSet.size() == secondSed.size() ? "true" : "false");
    }
}
