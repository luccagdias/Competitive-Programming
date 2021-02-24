package codeforces.difficulty800;

import java.util.Scanner;

public class Bulbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(solve(n, m, input));
    }

    private static String solve(int n, int m, Scanner input) {
        int[] bulbs = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();

            for (int j = 0; j < x; j++) {
                bulbs[input.nextInt()]++;
            }
        }

        for (int i = 1; i <= m; i++)
            if (bulbs[i] == 0)
                return "NO";

        return "YES";
    }
}
