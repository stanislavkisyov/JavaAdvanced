package JavaAdvanced_Exercises.Objects_Classes_and_Collections;

import java.util.*;

public class P02_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandCount = sc.nextInt();//GETTING THE FIRST NUMBER - HOW MANY NUMBERS WILL BE

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < commandCount; i++) {

            int command = sc.nextInt();//THE COMMAND NUMBER - WHICH IS IN FRONT OF THE NUMBER

            if (command == 1) {
                int numToPush = sc.nextInt();//THE NUMBER AFTER THE COMMAND ONE
                stack.push(numToPush);
                if (max < numToPush) {
                    max = numToPush;
                    maxStack.push(max);
                }
            } else if (command == 2) {
                int poppedItem = stack.pop();//IN THIS CASE WE ARE REMOVING THE ELEMENT PRESENT AT THE TOP OF THE STACK
                if (poppedItem == max) {
                    maxStack.pop();
                    if (maxStack.size() > 0) {
                        max = maxStack.peek();
                    } else {
                        max = Integer.MIN_VALUE;
                    }
                }
            } else {//FOR THE COMMAND WITH NUMBER 3 FOR PRINTING THE MAXIMUM ELEMENT IN THE STACK
                System.out.println(max);
            }
        }
    }
}

