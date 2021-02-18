package codeforces.difficulty800;

import java.util.Scanner;

public class CrazyComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int[] seconds = new int[n];
        for (int i = 0; i < n; i++) {
            seconds[i] = scanner.nextInt();
        }

        System.out.println(solve(n, c, seconds));
    }

    private static int solve(int n, int c, int[] seconds) {
        int ans = 1;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(seconds[i] - seconds[i + 1])  <= c)
                ans++;
            else
                ans = 1;
        }

        return ans;
    }
}
