package codeforces.difficulty800;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfStones = scanner.nextByte();
        scanner.nextLine();
        String stones = scanner.nextLine();

        byte stonesToTake = 0;
        for (int i = 0; i < numberOfStones - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                stonesToTake++;
            }
        }

        System.out.println(stonesToTake);
    }
}
