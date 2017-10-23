package Exam_22_10_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> joinedVloggers = new HashSet<>();
        Map<String, Integer> followingVloaggers = new HashMap<>();
        Map<String, Integer> followedVloaggers = new HashMap<>();

        while (true) {
            String input = br.readLine();

            if ("Statistics".equals(input)) {
                break;
            }
            String[] line = input.split("\\s+");
            String name = line[0];
            String command = line[1];

            if (command.equals("joined")) {
                joinedVloggers.add(name);
            } else if (command.equals("followed")) {
                String nameOfFollowing = line[2];
                if (!followedVloaggers.containsKey(nameOfFollowing) && joinedVloggers.contains(nameOfFollowing)) {
                    followedVloaggers.put(name, 0);
                    followingVloaggers.put(nameOfFollowing, 0);
                }
            }

        }
        System.out.println("test");
    }
}
