package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P03_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split("\\s+");
        int numbersOfElements = Integer.parseInt(commands[0]);
        int removeElements = Integer.parseInt(commands[1]);
        int peekElements = Integer.parseInt(commands[2]);
        String[] number = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < numbersOfElements; i++) {
            queue.add(Integer.parseInt(number[i]));
        }
        for (int i = 0; i < removeElements; i++) {
            queue.remove();
        }

        if (queue.contains(peekElements)) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println("0");
        } else {
            for (Integer integer : queue) {
                if (integer < minElement) {
                    minElement = integer;
                }
            }
            System.out.println(minElement);
        }
    }
}

