package JavaAdvanced_Lab.Data_Representation_and_Manipulation;

import java.util.Scanner;

public class P04_Recursive_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n));
    }

    private static long factorial(int n) {
        if (n <= 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
