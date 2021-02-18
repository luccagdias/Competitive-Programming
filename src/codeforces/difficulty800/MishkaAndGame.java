package codeforces.difficulty800;

import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solve(input));
    }

    private static String solve(Scanner input) {
        int ans = 0;

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int c = input.nextInt();

            if (m > c)
                ans++;
            else if (m < c)
                ans--;
        }

        if (ans > 0)
            return "Mishka";
        else if (ans < 0)
            return "Chris";
        else
            return "Friendship is magic!^^";
    }
}
