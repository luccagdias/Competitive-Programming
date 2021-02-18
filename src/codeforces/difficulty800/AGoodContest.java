package codeforces.difficulty800;

import java.util.Scanner;

public class AGoodContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solve(n , input));
    }

    private static String solve(int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            String name = input.next();
            int before = input.nextInt();
            int after = input.nextInt();

            if (before >= 2400 && before < after)
                return "YES";
        }

        return "NO";
    }
}
