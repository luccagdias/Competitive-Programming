package codeforces.difficulty800;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();

        StringBuilder fullBody = new StringBuilder();
        StringBuilder fullDots = new StringBuilder();

        for (int i = 0; i < m; i++) {
            fullBody.append("#");
            fullDots.append(".");
        }

        System.out.println(fullBody);
        for (int i = 1; i < n; i++) {

            if (i % 2 != 0) {
                if(fullDots.charAt(m - 1) == '.') {
                    fullDots.replace(0, 1, ".");
                    fullDots.replace(m - 1, m, "#");
                } else {
                    fullDots.replace(0, 1, "#");
                    fullDots.replace(m - 1, m, ".");
                }

                System.out.println(fullDots);
            } else {
                System.out.println(fullBody);
            }
        }
    }
}
