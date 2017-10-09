package JavaAdvanced_Lab.FUNCTIONAL_PROGRAMMING;

import java.util.*;
import java.util.function.Function;

public class P01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            numbers.add(Integer.parseInt(s.trim()));
        }

        numbers.removeIf(x -> x % 2 != 0);
        for (Integer number : numbers) {
            System.out.print(number.toString().replace(",", ""));
        }
        System.out.println();
        numbers.sort((n, m) -> n.compareTo(m));
        for (int i = 0; i < numbers.size(); i++) {

        }// Има за дописване!!!!!
    }
}
