package JavaAdvanced_Lab.Data_Representation_and_Manipulation;

import java.util.Scanner;

public class P03_Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int sum = sum(arr, 0);
        System.out.println(sum);
    }

    private static int sum(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return arr[i] + sum(arr, i + 1);
    }

}
