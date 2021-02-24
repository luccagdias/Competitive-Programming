package codeforces.difficulty800;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        System.out.println(solve(n, cards));
    }

    private static String solve(int n, int[] cards) {
        int sereja = 0;
        int dima = 0;

        int i = 0;
        int j = cards.length - 1;
        boolean serejasTurn = true;

        while (n-- > 0) {
            if (cards[i] > cards[j]) {
                if (serejasTurn)
                    sereja += cards[i];
                else
                    dima += cards[i];

                i++;
            } else {
                if (serejasTurn)
                    sereja += cards[j];
                else
                    dima += cards[j];

                j--;
            }

            serejasTurn = (serejasTurn) ? false : true;
        }

        return sereja + " " + dima;
    }
}
