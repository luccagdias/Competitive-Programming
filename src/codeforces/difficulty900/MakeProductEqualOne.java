package codeforces.difficulty900;

import java.util.Scanner;

public class MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        System.out.println(solve(n, a));

    }

    private static long solve(int n, int[] a) {
        int zeroes = 0, negatives = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroes++;
                continue;
            }

            if (a[i] > 1) {
                ans += a[i] - 1;
            }

            if (a[i] <= -1) {
                ans += Math.abs(a[i]) - 1;
                negatives++;
            }
        }

        if (negatives % 2 != 0) {
            if (zeroes > 0) {
                ans += 1;
                zeroes--;
            } else {
                ans += 2;
            }
        }

        ans += zeroes;

        return ans;
    }
}
