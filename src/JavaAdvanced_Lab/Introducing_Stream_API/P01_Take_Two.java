package JavaAdvanced_Lab.Introducing_Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class P01_Take_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tokens = Arrays.asList(scanner.nextLine().split("\\s+"));

        List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            numbers.add(Integer.valueOf(token));
        }

        numbers.stream().filter(x -> x >= 10 && x <= 20).distinct().limit(2).forEach(n -> System.out.print(n + " "));
    }
}
