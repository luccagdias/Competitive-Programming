package codeforces.difficulty800;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredSum = scanner.nextInt();
        int totalPoints = 10;

        System.out.println(solve(requiredSum, totalPoints));
    }

    private static int solve(int requiredSum, int totalPoints) {
        int a = requiredSum - totalPoints;

        if ((a >= 1 && a < 10) || a == 11)
            return 4;

        if (a == 10)
            return 15;

        return 0;
    }
}
