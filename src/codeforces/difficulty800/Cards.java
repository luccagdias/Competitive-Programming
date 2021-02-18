package codeforces.difficulty800;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            cards[i] = temp;
            sum += temp;
        }

        sum = sum / (n / 2);

        solve(n/2, sum, cards);
    }

    private static void solve(int n, int sumTarget, int[] cards) {

        int i = 0;
        while (n > 0 && i < cards.length) {
            int j = i + 1;

            if (cards[i] != 0) {
                while (j < cards.length && cards[i] + cards[j] != sumTarget)
                    j++;

                System.out.println((i + 1) + " " + (j + 1));
                cards[i] = 0;
                cards[j] = 0;
                n--;
            }

            i++;
        }
    }
}
