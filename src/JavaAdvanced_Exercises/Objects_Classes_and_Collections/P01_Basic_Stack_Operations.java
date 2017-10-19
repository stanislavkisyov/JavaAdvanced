package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");

        int numberOfElements = Integer.parseInt(line[0]);
        int numberToPops = Integer.parseInt(line[1]);
        int numberContainsInStack = Integer.parseInt(line[2]);
        int minElement = Integer.MAX_VALUE;

        String[] input = scanner.nextLine().split("\\s+");
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfElements; i++) {
            stack.push(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < numberToPops; i++) {
            stack.pop();
        }

        if (stack.contains(numberContainsInStack)) {
            System.out.println(true);
        } else if (stack.isEmpty()) {
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