package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Collections;
import java.util.Scanner;

public class P03_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banned = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String s : banned) {
            input = input.replaceAll(s, String.join("", Collections.nCopies(s.length(), "*")));
        }
        System.out.println(input);
    }
}
