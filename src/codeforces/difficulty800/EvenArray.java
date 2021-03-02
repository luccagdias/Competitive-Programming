package codeforces.difficulty800;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            System.out.println(solve(a));
        }

    }

    private static int solve(int[] a) {
        int wrongOdds = 0, wrongEvens = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0)
                wrongEvens++;

            if (i % 2 != 0 && a[i] % 2 == 0)
                wrongOdds++;
        }

        if (wrongEvens != wrongOdds)
            return -1;

        return wrongEvens;
    }
}
