package codeforces.difficulty800;

import java.util.Scanner;

public class FixYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0 ) {
            int n = input.nextInt();
            int m = input.nextInt();
            input.nextLine();

            System.out.println(solve(n, m, input));
        }
    }

    private static int solve(int n, int m, Scanner input) {
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            String s = input.nextLine();

            if (s.charAt(m - 1) == 'R')
                ans++;
        }

        String s = input.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'D')
                ans++;
        }

        return ans;
    }
}
