package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int[] s = new int[n];

            for (int i = 0; i < n; i++) {
                s[i] = input.nextInt();
            }

            System.out.println(solve(s));
        }
    }

    private static int solve(int[] s) {
        Arrays.sort(s);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length - 1; i++) {
            int temp = Math.abs(s[i] - s[i + 1]);

            if (temp < min)
                min = temp;
        }

        return min;
    }
}
