package codeforces.difficulty800;

import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x  = input.nextInt();

        solve(n, x, input);

    }

    private static void solve(int n, int x, Scanner input) {
        long packs = x, kids = 0;

        for (int i = 0; i < n; i++) {
            String operation = input.next();
            int d = input.nextInt();

            if (operation.compareTo("+") == 0)
                packs += d;
            else {
                if (packs < d)
                    kids++;
                else
                    packs -= d;
            }
        }

        System.out.println(packs + " " + kids);
    }
}
