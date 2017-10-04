package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.*;

public class P05_1_SoftUni_Party {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));

        TreeSet<String> regular = new TreeSet<>();

        while (true) {
            String guest = scanner.nextLine();

            if (guest.equals("PARTY")) {
                break;
            } else {
                regular.add(guest);
            }
        }
        while (true) {

            String guest = scanner.nextLine();

            if ("END".equals(guest)) {
                break;
            }
            if (regular.contains(guest)) {
                regular.remove(guest);
            }
        }
        System.out.println(regular.size());
        for (String s : regular) {
            System.out.println(s);
        }
    }

}
