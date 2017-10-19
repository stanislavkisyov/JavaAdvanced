package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class P11_Count_Symbols {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        Map<Character, Integer> charCount = new TreeMap<>();

        for (char currentChar : input) {
            if (!charCount.containsKey(currentChar)) {
                charCount.put(currentChar, 0);
            }
            charCount.put(currentChar, charCount.get(currentChar) + 1);
        }

        for (Character character : charCount.keySet()) {
            System.out.printf("%s: %d time/s\n", character, charCount.get(character));
        }
    }
}
