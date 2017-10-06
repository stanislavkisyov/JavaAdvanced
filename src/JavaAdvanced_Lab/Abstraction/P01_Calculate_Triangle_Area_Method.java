package JavaAdvanced_Lab.Abstraction;

import java.util.Scanner;

public class P01_Calculate_Triangle_Area_Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double base = Double.parseDouble(input[0]);
        double height = Double.parseDouble(input[1]);
        double area = calcTriangleArea(base, height);

        System.out.printf("Area = %.2f", area);
    }

    private static double calcTriangleArea(double base, double height) {
        return base * height / 2;
    }
}
