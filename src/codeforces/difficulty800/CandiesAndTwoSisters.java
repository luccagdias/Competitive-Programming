package codeforces.difficulty800;

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long candies = scanner.nextLong();

            if (candies % 2 == 0) {
                candies = (candies / 2) - 1;
            } else {
                candies = candies / 2;
            }

            System.out.println(candies);
        }
    }
}
