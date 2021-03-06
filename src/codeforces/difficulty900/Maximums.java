package codeforces.difficulty900;

import java.util.Scanner;

public class Maximums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }

        System.out.println(solve(b));

    }

    private static StringBuilder solve(int[] b) {
        StringBuilder ans = new StringBuilder();
        long[] a = new long[b.length];
        a[0] = Math.abs(b[0]);
        ans.append(Math.abs(b[0]) + " ");

        long max = -1;
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i - 1]);

            a[i] = max + b[i];
            ans.append(max + b[i] + " ");
        }

        return ans;
    }
}
