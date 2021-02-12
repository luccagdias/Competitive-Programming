package codeforces.difficulty900;

import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairOfSocks = scanner.nextInt();
        int m = scanner.nextInt();

        int days = 1;
        while (pairOfSocks > 0) {
            if (days % m != 0) {
                pairOfSocks--;
            }

            if (pairOfSocks == 0) {
                break;
            }

            days++;
        }

        System.out.println(days);
    }
}
