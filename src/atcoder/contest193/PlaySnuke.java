package atcoder.contest193;

import java.util.Scanner;

public class PlaySnuke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solve(n, input));
    }

    private static int solve(int n, Scanner input) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int p = input.nextInt();
            int x = input.nextInt();

            int remaining = x - a;
            if (remaining > 0 && p < ans) {
                ans = p;
            }
        }

        if (ans == Integer.MAX_VALUE)
            ans = -1;

        return ans;
    }
}
