package codeforces.difficulty800;

import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            System.out.println(solve(input));
        }
    }

    private static long solve(Scanner input) {
        int n = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        int mina = Integer.MAX_VALUE;
        int minb = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            if (temp < mina)
                mina = temp;

            a[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            if (temp < minb)
                minb = temp;

            b[i] = temp;
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.max(a[i] - mina, b[i] - minb);
        }

        return ans;
    }
}
