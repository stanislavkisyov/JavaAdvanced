package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.util.Scanner;

public class P08_First_Odd_or_Even_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        String[] commands = scanner.nextLine().split("\\s+");

        int numElements = Integer.parseInt(commands[1]);
        String oddOrEven = commands[2];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int temp = Integer.parseInt(numbers[i]);
            if (oddOrEven.equals("odd") && temp % 2 != 0) {
                System.out.printf("%d ", temp);
                count++;
                if (count == numElements) {
                    break;
                }
            } else if (oddOrEven.equals("even") && temp % 2 == 0) {
                System.out.printf("%d ",temp);
                count++;
                if (count == numElements) {
                    break;
                }
            }
        }
    }
}
