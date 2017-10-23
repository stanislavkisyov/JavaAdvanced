package Exam.Exam_Preparation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P02_Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = Integer.parseInt(reader.readLine());

        Deque<List<Integer>> allNumbers = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < numOfLines; i++) {
            String[] line = reader.readLine().split("\\s+");
            List<Integer> tempNum = new ArrayList<>();
            for (String s : line) {
                tempNum.add(Integer.parseInt(s));
            }
            allNumbers.addLast(tempNum);
        }

        while (!allNumbers.isEmpty()) {
            List<Integer> currentNumber = allNumbers.pop();
            int wave = currentNumber.get(0);
            for (int i = 1; i < currentNumber.size(); i++) {
                if (wave < currentNumber.get(i)) {
                    allNumbers.addLast(currentNumber.subList(i, currentNumber.size()));
                    break;
                }
            }
            output.add(wave);
        }
        System.out.println(output.size());
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }
    }
}
