package codeforces.difficulty800;

import java.util.Scanner;

public class BearAndReverseRadewoosh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = input.nextInt();
        int[] scores = new int[n];
        int[] minutes = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            minutes[i] = input.nextInt();
        }


        System.out.println(solve(n, c, scores, minutes));
    }

    private static String solve(int n, int c, int[] scores, int[] minutes) {
        int limakScore = 0;
        int radewooshScore = 0;

        int limakTime = 0;
        int radewooshTime = 0;

        int j = n - 1;
        for (int i = 0; i < n; i++, j--) {
            limakTime += minutes[i];
            radewooshTime += minutes[j];

            limakScore += Math.max(0, scores[i] - (c * limakTime));
            radewooshScore += Math.max(0, scores[j] - (c * radewooshTime));
        }

        if (limakScore == radewooshScore)
            return "Tie";

        return (limakScore > radewooshScore) ? "Limak" : "Radewoosh";
    }
}
