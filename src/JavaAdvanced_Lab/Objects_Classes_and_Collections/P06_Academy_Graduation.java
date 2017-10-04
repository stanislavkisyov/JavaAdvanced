package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.Scanner;
import java.util.TreeMap;

public class P06_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());


        TreeMap<String, Double> graduationList = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            String[] scores = scanner.nextLine().split("\\s+");
            double sum = 0;
            for (int j = 0; j < scores.length; j++) {
                sum += Double.parseDouble(scores[j]);
            }
            double average = sum / scores.length;
            graduationList.put(name, average);
        }

        for (String key : graduationList.keySet()) {
            System.out.println(key + " is graduated with " + graduationList.get(key));
        }
    }
}
