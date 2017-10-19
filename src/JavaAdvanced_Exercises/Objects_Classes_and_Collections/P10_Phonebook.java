package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_Phonebook {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        while (true) {
            String[] contactOfPhoneBook = scanner.nextLine().split("-");

            if ("search".equals(contactOfPhoneBook[0])) {
                break;
            }
            String name = contactOfPhoneBook[0];
            String number = contactOfPhoneBook[1];
            phoneBook.put(name, number);
        }
        while (true) {
            String searchName = scanner.nextLine();
            if ("stop".equals(searchName)) {
                break;
            }
            if (phoneBook.containsKey(searchName)) {
                System.out.printf("%s -> %s\n", searchName, phoneBook.get(searchName));
            }else {
                System.out.println("Contact " + searchName +" "+ "does not exist.");
            }
        }
    }

}
