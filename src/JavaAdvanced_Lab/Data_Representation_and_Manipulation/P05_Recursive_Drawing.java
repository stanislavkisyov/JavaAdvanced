package JavaAdvanced_Lab.Data_Representation_and_Manipulation;

import java.util.Collections;
import java.util.Scanner;

public class P05_Recursive_Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        drawing(num);
    }

    private static void drawing(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(String.join("", Collections.nCopies(num, "*")));
        drawing(num - 1);
        System.out.println(String.join("", Collections.nCopies(num, "#")));
    }
}
