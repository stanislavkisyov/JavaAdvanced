package JavaAdvanced_Lab.Objects_Classes_and_Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentsGraduation = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            String[] scores = scanner.nextLine().split("\\s+");
            double result = 0;
            for (int j = 0; j < scores.length; j++) {
                result += Double.parseDouble(scores[j]);
            }
            double average = result / scores.length;
            studentsGraduation.put(name, average);
        }

        for (String s : studentsGraduation.keySet()) {
            System.out.println(s + " is graduated with " + studentsGraduation.get(s));
        }
    }
}
