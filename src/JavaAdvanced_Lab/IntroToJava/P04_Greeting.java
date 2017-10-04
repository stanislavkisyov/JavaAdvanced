package JavaAdvanced_Lab.IntroToJava;

import java.util.Scanner;

public class P04_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        if (firstName.isEmpty() && lastName.isEmpty()){
            System.out.printf("Hello, ***** *****!");
            return;
        }

        if (firstName.isEmpty()){
            System.out.printf("Hello, ***** %s!", lastName);
        }else if (lastName.isEmpty()){
            System.out.printf("Hello, %s *****!",firstName);
        }else {
            System.out.printf("Hello, %s %s!", firstName, lastName);

        }
    }
}
