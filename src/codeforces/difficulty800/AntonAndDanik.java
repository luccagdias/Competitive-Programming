package codeforces.difficulty800;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = scanner.nextInt();
        scanner.nextLine();
        String winners = scanner.nextLine();
        int anton = 0, danik = 0;

        for (int i = 0; i < games; i++) {
            if (winners.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }

        if (anton == danik) {
            System.out.println("Friendship");
        } else {
            System.out.println((anton > danik) ? "Anton" : "Danik");
        }
    }
}
