package codeforces.difficulty800;

import java.util.Scanner;

public class VitalyAndNight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(solve(n, m, input));
    }

    private static int solve(int n, int m, Scanner input) {
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = input.nextInt();
                int y = input.nextInt();

                if (x == 1 || y == 1)
                    ans++;
            }

        }

        return ans;
    }
}
