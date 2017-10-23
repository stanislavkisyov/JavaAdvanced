package Exam.Exam_Preparation_1;

import java.util.HashMap;
import java.util.Map;

public class P04 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Stanislav", "22323");
        phoneBook.put("Penka", "121212");
        phoneBook.put("Minka", "324324");
        phoneBook.put("Stamat", "4324454");

        System.out.println(phoneBook.values());
        System.out.println(phoneBook.entrySet());
        System.out.println(phoneBook.remove("ivan"));
    }
}
