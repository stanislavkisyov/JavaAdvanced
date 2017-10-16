package JavaAdvanced_Exercises.String_Proccesing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P09_Match_Full_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "^([A-Z])([a-z])+ ([A-Z])([a-z])+$";
        while (!text.equals("end")) {
            if (Pattern.matches(regex, text)) {
                System.out.println(text);
            }
            text = scanner.nextLine();
        }
    }
}
