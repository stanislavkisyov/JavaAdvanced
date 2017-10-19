package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isBAlanced(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBAlanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                stack.addFirst(currentChar);
            } else {
                if (!stack.isEmpty()) {
                    char first = stack.pop();
                    if (first == '{') {
                        if (currentChar != '}') {
                            return false;
                        }
                    } else if (first == '[') {
                        if (currentChar != ']') {
                            return false;
                        }
                    } else if (first == '(') {
                        if (currentChar != ')') {
                            return false;
                        }
                    }

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
