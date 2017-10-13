package JavaAdvanced_Exercises.String_Proccesing;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        BigInteger result = new BigInteger(first).add(new BigInteger(second));
        System.out.println(result);
    }
}
