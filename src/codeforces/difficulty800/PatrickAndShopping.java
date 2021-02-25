package codeforces.difficulty800;

import java.util.Scanner;

public class PatrickAndShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        System.out.println(solve(d1, d2, d3));
    }

    private static long solve(int d1, int d2, int d3) {
        if (d1 == d2 && d1 == d3)
            return 3 * d1;

        long ans = d1 + d2 + d3;

        ans = Math.min(ans, 2 * (d1 + d2));
        ans = Math.min(ans, 2 * (d1 + d3));
        ans = Math.min(ans, 2 * (d2 + d3));

        return ans;
    }
}
