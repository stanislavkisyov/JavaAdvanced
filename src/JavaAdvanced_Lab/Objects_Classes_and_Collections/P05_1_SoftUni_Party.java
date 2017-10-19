package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P05_1_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new TreeSet<>();

        while (true) {
            String reservation = scanner.nextLine();
            if (reservation.equals("PARTY")) {
                break;
            } else {
                guests.add(reservation);
            }
        }
        while (true) {
            String reservation = scanner.nextLine();
            if (reservation.equals("END")) {
                break;
            } else {
                guests.remove(reservation);
            }
        }
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
