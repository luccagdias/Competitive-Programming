package codeforces.difficulty800;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int count = 1;
        while (m >= count) {
            m -= count;

            count = (count == n) ? 1 : count + 1;
        }

        System.out.println(m);
    }
}
