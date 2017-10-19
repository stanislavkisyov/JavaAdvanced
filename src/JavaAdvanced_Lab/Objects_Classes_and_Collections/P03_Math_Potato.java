package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P03_Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());
        Deque<String> queue = new ArrayDeque<>();
        int n = 1;
        Collections.addAll(queue, input);
        while (queue.size() > 1) {
            for (int i = 1; i < num; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(n)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            n++;
        }
        System.out.println("Last is " + queue.peek());

    }
    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}