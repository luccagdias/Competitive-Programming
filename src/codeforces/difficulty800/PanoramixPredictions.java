package codeforces.difficulty800;

import java.util.Scanner;

public class PanoramixPredictions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(solve(n, m));
    }

    private static String solve(int n, int m) {
        if (m % 2 == 0)
            return "NO";

        int possibleNextPrime = (n == 2) ? n + 1 : n + 2;

        for (int i = 2; i < possibleNextPrime; i++) {
            if (possibleNextPrime % i == 0) {
                possibleNextPrime++;
                i = 2;
            }
        }

        return (possibleNextPrime == m) ? "YES" : "NO";
    }
}
