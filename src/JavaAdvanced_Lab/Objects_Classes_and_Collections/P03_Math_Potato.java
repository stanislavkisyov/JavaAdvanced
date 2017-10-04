package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P03_Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, names);

        int counter = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.pop());
            }
            if (isPrime(counter)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.pop());
            }
            counter++;
        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrime(int counter) {
        if(counter == 1){
            return false;
        }

        for (int i = 2; i < counter; i++) {
            if(counter % i == 0){
                return false;
            }
        }
        return true;
    }
}
