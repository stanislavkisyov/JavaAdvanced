package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());

        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);

        while (queue.size() > 1) {
            for (int i = 1; i < number; i++){
                queue.offer(queue.pop());
            }
            System.out.println("Removed "+queue.poll());
        }
        System.out.println("Last is "+queue.poll());
    }
}
