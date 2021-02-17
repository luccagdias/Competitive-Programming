package codeforces.difficulty800;

import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solve(input);
    }

    private static void solve(Scanner input) {
        int n = input.nextInt();

        if (n % 2 == 0) {
            n /= 2;
            System.out.println(n);
        }
        else {
            n = (n - 3) / 2;
            System.out.println(n + 1);
            System.out.print("3 ");
        }

        for (int i = 0; i < n; i++)
            System.out.print("2" + " ");
    }
}
