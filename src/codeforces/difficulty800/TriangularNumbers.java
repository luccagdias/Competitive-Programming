package codeforces.difficulty800;

import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        System.out.println(solve(n));
    }

    private static String solve(int n) {
        int result = 0;
        for (int i = 1; result < n; i++) {
            result += i;
        }

        return (result == n) ? "YES" : "NO";
    }
}
