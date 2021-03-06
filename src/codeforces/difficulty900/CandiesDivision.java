package codeforces.difficulty900;

import java.util.Scanner;

public class CandiesDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            System.out.println(solve(n, k));
        }
    }

    private static int solve(int n, int k) {
        int ans = (n / k) * k;
        int a = n % k;
        int b = k / 2;

        ans += Math.min(a, b);

        return ans;
    }
}
