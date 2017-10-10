package JavaAdvanced_Lab.Introducing_Stream_API;

import java.util.*;
import java.util.stream.Stream;

public class P03_First_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.asList(scanner.nextLine().split("\\s+"));
        String[] input = scanner.nextLine().split(" ");

        HashSet<Character> letters = new HashSet<>();

        Optional<String> first = names.stream().filter(s -> letters.contains(s.toLowerCase().charAt(0))).sorted().findFirst();

        if (first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}
//Todo: Трябва да адна чарактакрите!!!!