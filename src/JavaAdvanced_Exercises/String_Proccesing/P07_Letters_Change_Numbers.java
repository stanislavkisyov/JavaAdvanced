package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Scanner;

public class P07_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0.0;

        for (int i = 0; i < input.length; i++) {
            Character firstChar = input[i].charAt(0);
            Character lastChar = input[i].charAt(input[i].length() - 1);

            Double number = Double.parseDouble(input[i].substring(1, input[i].length() - 1));

            if (firstChar.toString().toUpperCase().equals(firstChar.toString())) {
                sum += number / (firstChar - 64);
            } else {
                Integer first = (int)(Character.toUpperCase(firstChar)) - 64;
                sum += number * first;
            }

            if (lastChar.toString().toUpperCase().equals(lastChar.toString())) {
                Integer last = lastChar - 64;
                sum -= last;
            } else {
                Integer last = lastChar - 96;
                sum += last;
            }

        }

        System.out.printf("%.2f\n", sum);
    }
}
