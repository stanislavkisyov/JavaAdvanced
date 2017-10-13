package JavaAdvanced_Lab.String_Processing;

import java.util.Scanner;

public class P02_Parse_URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("://");

        String protocol = line[0];
        if (line.length != 2) {
            System.out.println("Invalid URL");
        } else {
            int serverIndex = line[1].indexOf("/");
            String server = line[1].substring(0, serverIndex);
            String resources = line[1].substring(serverIndex + 1, line[1].length());
            System.out.println("Protocol = "+protocol);
            System.out.println("Server = "+server);
            System.out.println("Resources = "+resources);
        }
    }
}
