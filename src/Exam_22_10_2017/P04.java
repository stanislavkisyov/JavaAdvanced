package Exam_22_10_2017;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();


        while (true) {
            String words = scanner.nextLine();
            if ("Print".equals(words)) {
                break;
            }

            int startIndex = input.indexOf(words);
//            boolean match = input(words);
            int endIndex = startIndex + words.length();

            sb.append(endIndex);
            System.out.println(input);
        }

    }
}
