package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P09_Extract_a_Bit_from_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int position = scanner.nextInt();
        int mask = num >> position;
        int result = mask & 1;
        System.out.println(Integer.toBinaryString(result));
    }
}
