package JavaAdvanced_Lab.String_Processing;

import java.util.Scanner;

public class P03_Parse_Tags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (input.contains("<upcase>")) {
            int start = input.indexOf("<upcase>");
            int end = input.indexOf("</upcase>");
            String subs= input.substring(start + 8, end);

            input = input.replace("<upcase>" + subs + "</upcase>", subs.toUpperCase());
        }
        System.out.println(input);
    }
}
