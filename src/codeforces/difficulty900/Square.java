package codeforces.difficulty900;

import java.util.Scanner;
import static java.lang.Math.*;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            int a1 = input.nextInt();
            int a2 = input.nextInt();
            int b1 = input.nextInt();
            int b2 = input.nextInt();

            System.out.println(solve(a1, a2, b1, b2));
        }

    }

    private static String solve(int a1, int a2, int b1, int b2) {
        if (max(a1, a2) != max(b1, b2))
            return "No";

        if (min(a1, a2) + min(b1, b2) != max(a1, a2))
            return "No";

        return "Yes";
    }
}
