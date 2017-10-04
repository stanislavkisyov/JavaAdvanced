package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split("\\s+");

        int numberOfDigits = Integer.parseInt(commands[0]);
        int elementsToPop = Integer.parseInt(commands[1]);
        int elementsContainsInPop = Integer.parseInt(commands[2]);
        int minElement = Integer.MAX_VALUE;
        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfDigits; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }
        if (stack.contains(elementsContainsInPop)) {
            System.out.println(true);
        } else if (stack.size() == 0) {
            System.out.println("0");
        } else {
            for (Integer integer : stack) {
                if (integer < minElement) {
                    minElement = integer;
                }
            }
            System.out.println(minElement);
        }

    }
}
