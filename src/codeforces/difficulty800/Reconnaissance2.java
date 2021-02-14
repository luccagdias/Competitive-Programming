package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldiers = scanner.nextInt();

        int[] height = new int[soldiers];
        for (int i = 0; i < soldiers; i++) {
            height[i] = scanner.nextInt();;
        }

        int index1 = 0;
        int index2 = soldiers - 1;

        int difference = Math.abs(height[index1] - height[index2]);
        for (int i = 0; i < soldiers - 1; i++) {
            int temp = Math.abs(height[i] - height[i + 1]);

            if (temp < difference) {
                difference = temp;
                index1 = i;
                index2 = i + 1;
            }
        }

        System.out.println(++index1 + " " + ++index2);
    }
}
