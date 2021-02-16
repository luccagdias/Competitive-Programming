package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class HollidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] citizens = new int[n];
        for (int i = 0; i < n; i++) {
            citizens[i] = scanner.nextInt();
        }

        System.out.println(solve(n, citizens));
    }

    private static int solve(int n, int[] citizens) {
        Arrays.sort(citizens);
        int max = citizens[n - 1];

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += max - citizens[i];
        }

        return result;
    }
}
