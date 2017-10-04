package JavaAdvanced_Lab.IntroToJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_Euro_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = Double.parseDouble(scanner.nextLine());

        double pricePerKilo = 1.20;

        BigDecimal priceInLeva = new BigDecimal(quantity * pricePerKilo);

        BigDecimal exchangeRate = new BigDecimal("4210500000000");

        BigDecimal marksNeeded = exchangeRate.multiply(priceInLeva);

        System.out.printf("%.2f marks", marksNeeded);
    }
}
