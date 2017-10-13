package JavaAdvanced_Lab.String_Processing;

import java.util.Scanner;

public class P01_Students_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" - ");

        String name = input[0];

        String[] grade = input[1].split(", ");

        double grade1 = Double.parseDouble(grade[0]);
        double grade2 = Double.parseDouble(grade[1]);
        double grade3 = Double.parseDouble(grade[2]);

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println(String.format("%1$-10s | %2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP",
                "AdvOOP", "Average"));
        System.out.println(
                String.format("%1$-11s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name, grade1, grade2, grade3, average));
    }
}