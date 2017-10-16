package JavaAdvanced_Lab.Data_Representation_and_Manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class P02_1_Serching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int key = Integer.parseInt(scanner.nextLine());

        int[] sortArrays = new int[input.length];


        for (int i = 0; i < input.length; i++) {
            sortArrays[i] = Integer.parseInt(input[i]);
        }
        System.out.println(binarySearch(sortArrays, key, 0, sortArrays.length));
    }

    private static int binarySearch(int[] arr, int x, int start, int end) {

        if (x > arr[arr.length - 1]){
            return -1;
        }
        while (end >= start) {
            int middle = (start + end) / 2;
            if (arr[middle] < x){
                start = middle + 1;
            }else if (arr[middle] > x){
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
