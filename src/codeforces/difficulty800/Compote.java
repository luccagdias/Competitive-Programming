package codeforces.difficulty800;

import java.util.Scanner;

public class Compote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lemons = scanner.nextInt();
        int apples = scanner.nextInt();
        int pears = scanner.nextInt();

        System.out.println(solve(lemons, apples, pears));
    }

    private static int solve(int lemons, int apples, int pears) {
        if (lemons < 1 || apples < 2 || pears < 4)
            return 0;

        int t = Math.min(Math.min(lemons, apples / 2), pears / 4);
        return t * 7;
    }
}
