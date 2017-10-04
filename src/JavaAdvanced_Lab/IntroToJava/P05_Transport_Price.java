package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P05_Transport_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilometers = Double.parseDouble(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double initialTaxForTaxi = 0.70;
        double priceForBus = 0.09 * kilometers;
        double priceForTrain = 0.06 * kilometers;

        if (kilometers < 20 && dayOrNight.equals("day")){
            double priceForTaxiInDay = kilometers * 0.79 + initialTaxForTaxi;
            System.out.printf("%.2f", priceForTaxiInDay);
        } else if (kilometers < 20 && dayOrNight.equals("night")){
            double priceForTaxiInNight = kilometers * 0.90 + initialTaxForTaxi;
            System.out.printf("%.2f", priceForTaxiInNight);
        }
        if (kilometers >= 20 && kilometers <= 100){
            System.out.printf("%.2f", priceForBus);
        } else if (kilometers > 100){
            System.out.printf("%.2f", priceForTrain);
        }

    }
}
