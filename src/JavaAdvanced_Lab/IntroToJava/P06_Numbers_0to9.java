package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P06_Numbers_0to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 10){
            System.out.println("Number: " + n);
            n++;
        }
    }
}
