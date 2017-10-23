package Exam.Exam_Preparation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(?<character>[_,])(?<target>[a-zA-Z]+)(\\d)");

        Map<String, String> map = new LinkedHashMap<>();

        while (true) {
            String line = br.readLine();
            line = decrypt(map, line);
            if ("Ascend".equals(line)) {
                break;
            }
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String match = matcher.group();
                String firstMatch = matcher.group(1);
                String message = matcher.group(2);
                Integer digits = Integer.valueOf(matcher.group(3));
                StringBuilder builder = new StringBuilder();
                if (firstMatch.equals("_")) {
                    for (int i = 0; i < message.length(); i++) {
                        builder.append((char) (message.charAt(i) - digits));
                    }
                } else {
                    for (int i = 0; i < message.length(); i++) {
                        builder.append((char) (message.charAt(i) + digits));
                    }
                }
                map.put(match, builder.toString());
                line = line.replace(match, builder.toString());
            }
            System.out.println(line);
        }
    }

    private static String decrypt(Map<String, String> map, String line) {

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            line = line.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        return line;
    }
}
