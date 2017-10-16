package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P10_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";

        while (!text.equals("end")) {
            if (Pattern.matches(regex, text)) {
                System.out.println(text);
            }
            text = scanner.nextLine();
        }
    }
}
