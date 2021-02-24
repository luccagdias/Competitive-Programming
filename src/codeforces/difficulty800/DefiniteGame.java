package codeforces.difficulty800;

import java.util.Scanner;

public class DefiniteGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solve(n));
    }

    private static int solve(int n) {
        return (n == 2) ? 2 : 1;
    }
}
