package codeforces.difficulty800;

import java.util.Scanner;

public class HitTHeLotery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long dollars = scanner.nextLong();
        long bills = 0L;

        while (dollars >= 100) {
            bills += dollars / 100;
            dollars %= 100;
        }

        while (dollars >= 20) {
            bills += dollars / 20;
            dollars %= 20;
        }

        while (dollars >= 10) {
            bills += dollars / 10;
            dollars %= 10;
        }

        while (dollars >= 5) {
            bills += dollars / 5;
            dollars %= 5;
        }

        bills += dollars;
        System.out.println(bills);
    }
}
