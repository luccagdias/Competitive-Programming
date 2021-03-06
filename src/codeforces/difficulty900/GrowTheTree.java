package codeforces.difficulty900;

import java.util.Arrays;
import java.util.Scanner;

public class GrowTheTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(solve(n, a));
    }

    private static long solve(int n, int[] a) {
        Arrays.sort(a);

        long x = 0, y = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                y += a[i];
                x += a[n - 1 - i];
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                y += a[i];
                x += a[n - 1 - i];
            }

            x += a[n / 2];
        }

        return x * x + y * y;
    }
}
