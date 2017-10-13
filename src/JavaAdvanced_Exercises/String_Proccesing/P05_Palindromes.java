package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P05_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "[\\s !?.,]";
        String[] input = scanner.nextLine().split(pattern);
        Set<String> order = new TreeSet<>();
        for (String word : input) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            if (word.equals(sb.toString()) && !word.equals("")) {
                order.add(word);
            }
        }
        System.out.println(order);


    }
}
