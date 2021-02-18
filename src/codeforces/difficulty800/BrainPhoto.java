package codeforces.difficulty800;

import java.util.Scanner;

public class BrainPhoto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();

        System.out.println(solve(n, m, input));
    }

    private static String solve(int n, int m, Scanner input) {
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();

            if (s.contains("C") || s.contains("M") || s.contains("Y"))
                return "#Color";
        }

        return "#Black&White";
    }
}
