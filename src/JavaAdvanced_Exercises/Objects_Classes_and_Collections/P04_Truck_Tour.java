package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P04_Truck_Tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPumps = Integer.parseInt(scanner.nextLine());
        Deque<String> allPumps = new ArrayDeque<>();

        for (int i = 0; i < numberOfPumps; i++) {
            String pumps = scanner.nextLine();
            allPumps.addLast(pumps);
        }
        int count = 0;
        while (true) {
            Long ourFuel = 0L;
            boolean found = true;
            for (String allPump : allPumps) {
                Long currentFuel = Long.valueOf(allPump.split(" ")[0]);
                Long distance = Long.valueOf(allPump.split(" ")[1]);
                ourFuel += currentFuel;
                if (ourFuel < distance) {
                    found = false;
                    break;
                }
                ourFuel -= distance;

            }
            if (found) {
                System.out.println(count);
                break;
            }
            allPumps.addLast(allPumps.poll());
            count++;
        }
    }
}
