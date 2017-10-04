package JavaAdvanced_Lab.IntroToJava;

import java.math.BigInteger;
import java.util.Scanner;

public class P07_Product_of_Numbers_NM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = scanner.nextInt();
        int n = startIndex;
        int endIndex = scanner.nextInt();

        BigInteger sum = BigInteger.ONE;


        while (startIndex <= endIndex){
            BigInteger number = new BigInteger("" + startIndex);
            sum = sum.multiply(number);
            startIndex++;

        }

        System.out.printf("product[%d..%d] = %d\n", n, endIndex, sum);
    }
}
