package JavaAdvanced_Exercises.String_Proccesing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P01_Count_Substring_Occurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String stack = reader.readLine();
        String world = reader.readLine();

        int count = 0;
        for (int i = 0; i < stack.length() - world.length() - 1; i++) {
            if (world.equalsIgnoreCase(stack.substring(i, i + world.length()))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
