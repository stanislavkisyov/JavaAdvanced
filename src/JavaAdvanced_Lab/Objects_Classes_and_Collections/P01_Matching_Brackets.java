package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01_Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (ch == '('){
                stack.push(i);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                int contains = i + 1;
                System.out.println(input.substring(startIndex, contains));
            }
        }
    }
}
