package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//
public class P04_1_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new HashSet<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            } else {
                String[] input = command.split(", ");
                if (input[0].equals("IN")) {
                    cars.add(input[1]);
                } else {
                    cars.remove(input[1]);
                }
            }
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
