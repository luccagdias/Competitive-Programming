package codeforces.difficulty800;

import java.util.Scanner;

public class FashionabLee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            int n = input.nextInt();
            System.out.println(solve(n));
        }
    }

    private static String solve(int n) {
        return (n % 4 == 0) ? "YES" : "NO";
    }
}
