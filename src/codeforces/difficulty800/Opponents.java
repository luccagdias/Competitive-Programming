package codeforces.difficulty800;

import java.util.Scanner;

public class Opponents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        input.nextLine();

        System.out.println(solve(n, d, input));
    }

    private static int solve(int n, int d, Scanner input) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < d; i++) {
            String s = input.nextLine();

            if(s.contains("0"))
                max++;
            else {
                if (max > ans)
                    ans = max;

                max = 0;
            }

        }

        return Math.max(ans, max);
    }
}
