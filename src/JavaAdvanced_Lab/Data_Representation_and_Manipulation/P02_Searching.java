package JavaAdvanced_Lab.Data_Representation_and_Manipulation;

import java.util.Scanner;

public class P02_Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int key = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[input.length];
        int temp = -1;

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(lineToSerch(arr, key, temp));
    }

    private static int lineToSerch(int[] arr, int key, int temp) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return temp;
    }
}
