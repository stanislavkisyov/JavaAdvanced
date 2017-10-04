package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P10_Modify_A_Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pos = scanner.nextInt();
        int v = scanner.nextInt();

        if (v == 1) {
            int mask = (v << pos);
            int result = num | mask;
            System.out.println(result);
        }else {
            int mask = ~(1 << pos);
            int result = num & mask;
            System.out.println(result);
        }

    }
}
