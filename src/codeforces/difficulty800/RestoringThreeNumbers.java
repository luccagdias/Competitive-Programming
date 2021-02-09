package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sums = new int[4];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = scanner.nextInt();
        }
        Arrays.sort(sums);

        int aPlusC = sums[1];
        int aMinusC = sums[0] - sums[2];

        int a = (aPlusC + aMinusC) / 2;
        int c = aPlusC - a;
        int b = sums[2] - c;

        System.out.println(a + " " + b + " " + c);
    }
}
