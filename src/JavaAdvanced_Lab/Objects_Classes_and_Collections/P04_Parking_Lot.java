package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.HashSet;
import java.util.Scanner;

public class P04_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parkingLot = new HashSet<String>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("END")){
                break;
            } else {
                String[] line = input.split(", ");
                if (line[0].equals("IN")){
                    parkingLot.add(line[1]);
                }else {
                    parkingLot.remove(line[1]);
                }
            }

        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        for (String s : parkingLot) {
            System.out.println(s);
        }
    }
}
