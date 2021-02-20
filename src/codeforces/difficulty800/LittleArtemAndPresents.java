package codeforces.difficulty800;

import java.util.Scanner;

public class LittleArtemAndPresents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int ans = ((n / 3) * 2);

        if (n % 3 != 0)
            ans++;

        return ans;
    }
}
