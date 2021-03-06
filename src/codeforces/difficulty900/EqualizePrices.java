package codeforces.difficulty900;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizePrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            System.out.println(solve(n, k, a));
        }

    }

    private static int solve(int n, int k, int[] a) {
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];

        int ans = min + k;

        if (Math.abs(ans - max) > k)
            return -1;

        return ans;
    }
}
