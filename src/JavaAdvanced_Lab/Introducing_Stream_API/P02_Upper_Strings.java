package JavaAdvanced_Lab.Introducing_Stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class P02_Upper_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> strings = Arrays.asList(bufferedReader.readLine().split("\\s+"));

        strings.stream().map(s -> s.toUpperCase()).forEach(n -> System.out.print(n + " "));


    }
}
