package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P12_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Long> resource = new LinkedHashMap<>();

        while (true) {
            String product = scanner.nextLine();
            if ("stop".equals(product)) {
                break;
            }
            Long quantity = Long.parseLong(scanner.nextLine());
            if (!resource.containsKey(product)) {
                resource.put(product, Long.valueOf(0));
            }
            resource.put(product, resource.get(product) + quantity);
        }

        for (String s : resource.keySet()) {
            System.out.println(s + " -> " + resource.get(s));
        }

    }
}
