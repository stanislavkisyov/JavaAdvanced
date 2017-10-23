package Exam_22_10_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String[] stoones = scanner.readLine().split("\\s+");

        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> goldElement = new ArrayDeque<>();
        for (int i = 0; i < stoones.length; i++) {
            queue.addLast(Integer.valueOf(stoones[i]));
        }
        int test = 23;

        while (true) {
            String input = scanner.readLine();

            if ("Revision".equals(input)) {
                break;
            }
            String[] line = input.split("\\s+");
            String commands = line[0];
            int numberOfElements = Integer.parseInt(line[2]);

            if (commands.equals("Apply")) {
                for (int i = 0; i <numberOfElements ; i++) {
                    int currentNum = queue.poll();
                    if (queue.isEmpty()) {
                        continue;
                    }
                    if (currentNum >= 2) {
                        currentNum--;
                        queue.addLast(currentNum);
                    } else {
                        currentNum--;
                        goldElement.addLast(currentNum);
                    }
                }
            } else if (commands.equals("Air")) {
                int damage = numberOfElements ;
                if (goldElement.isEmpty()) {
                    continue;
                }
                int currentGoldElement = goldElement.remove();
                currentGoldElement += damage ;
                queue.addLast(currentGoldElement);
            }

        }
        System.out.println(Arrays.toString(queue.toArray()).replaceAll("[\\]\\[,]", ""));
        System.out.println(goldElement.size());
    }
}
