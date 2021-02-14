package codeforces.difficulty800;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ranks = scanner.nextInt();

        int[] years = new int[ranks];
        for (int i = 1; i < ranks; i++) {
            years[i] = scanner.nextInt();
        }

        int beginRank = scanner.nextInt();
        int endRank = scanner.nextInt();

        int ranksToAchieve = endRank - beginRank;
        int result = 0;
        for (int i = beginRank; i < endRank; i++) {
            result += years[i];
        }

        System.out.println(result);
    }
}
