package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        Deque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            queue.offer(input[i]);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < num; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.peek());
    }
}