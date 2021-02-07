package codeforces.contests.round700;

import java.util.Scanner;

public class TheGreatHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testCases = scanner.nextLong();

        for (int i = 0; i < testCases; i++) {
            int  heroAttack = scanner.nextInt();
            int  heroHealth = scanner.nextInt();
            int  monsters = scanner.nextInt();

            long[] monstersAttacks = new long[monsters];
            for (int j = 0; j < monsters; j++) {
                monstersAttacks[j] = scanner.nextLong();
            }

            long[] monstersHealths = new long[monsters];
            for (int j = 0; j < monsters; j++) {
                monstersHealths[j] = scanner.nextLong();
            }

            int monstersDeads = 0;
            boolean heroIsAlive = true;
            while ((monstersDeads < monsters) && heroIsAlive) {
                for (int j = 0; j < monsters; j++) {
                    if (monstersHealths[j] < 1) {
                        continue;
                    }

                    heroHealth -= monstersAttacks[j];
                    monstersHealths[j] -= heroAttack;

                    if (monstersHealths[j] < 1) {
                        monstersDeads++;
                    }

                    if(heroHealth < 1) {
                        heroIsAlive = false;
                    }
                }
            }

            System.out.println((monstersDeads == monsters) ? "YES" : "NO");
        }
    }
}
