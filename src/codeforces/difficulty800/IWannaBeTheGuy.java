package codeforces.difficulty800;

import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int levels = scanner.nextInt();
        HashSet<Integer> levelsTheyCanPass = new HashSet<>();

        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            levelsTheyCanPass.add(scanner.nextInt());
        }

        int y = scanner.nextInt();
        for (int i = 0; i < y; i++) {
            levelsTheyCanPass.add(scanner.nextInt());
        }

        System.out.println((levelsTheyCanPass.size() == levels) ? "I become the guy." : "Oh, my keyboard!");
    }
}
