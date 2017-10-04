package JavaAdvanced_Exercises.IntroToJava_Exercises;

import java.util.Scanner;

public class P11_Game_of_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        int bestScore = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 0; i < numberOfPlayers; i++) {

            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) % 2 == 0) {
                    score += name.charAt(j);
                } else {
                    score -= name.charAt(j);
                }
            }
            if (score > bestScore) {
                bestScore = score;
                winner = name;
            }
        }
        System.out.printf("The winner is %s - %d points\n", winner, bestScore);
    }
}
