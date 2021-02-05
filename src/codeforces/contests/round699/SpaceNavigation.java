package codeforces.contests.round699;

import java.util.Scanner;

public class SpaceNavigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            boolean reachedX = false;
            boolean reachedY = false;

            int totalU = 0;
            int totalD = 0;
            int totalR = 0;
            int totalL = 0;

            int px = scanner.nextInt();
            int py = scanner.nextInt();
            scanner.nextLine();
            String orders = scanner.nextLine();

            for (int j = 0; j < orders.length(); j++) {
                char order = orders.charAt(j);

                if (order == 'U') {
                    totalU++;
                } else if (order == 'D') {
                    totalD--;
                } else if (order == 'R') {
                    totalR++;
                } else if (order == 'L') {
                    totalL--;
                }
            }

            if (px > 0) {
                if (totalR >= px) {
                    reachedX = true;
                }
            } else {
                if (totalL <= px) {
                    reachedX = true;
                }
            }

            if (py > 0) {
                if (totalU >= py) {
                    reachedY = true;
                }
            } else {
                if (totalD <= py) {
                    reachedY = true;
                }
            }

            System.out.println((reachedX && reachedY) ? "YES" : "NO");
        }
    }
}
