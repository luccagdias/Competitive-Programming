package codeforces.difficulty800;

import java.util.Scanner;

public class SashaAndSticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();

        System.out.println(solve(n, k));
    }

    private static String solve(long n, long k) {
        long ans = n / k;

        if (n == k)
            return "YES";

        return (ans % 2 == 0) ? "NO" : "YES";
    }
}
