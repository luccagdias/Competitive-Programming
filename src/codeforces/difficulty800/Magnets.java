package codeforces.difficulty800;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMagnets = scanner.nextInt();
        scanner.nextLine();
        String lastMagnet = "22";
        int groups = 1;

        for (int i = 0; i < numOfMagnets; i++) {
            String magnet = scanner.nextLine();

            if (lastMagnet.charAt(1) == magnet.charAt(0)) {
                groups ++;
            }

            lastMagnet = magnet;
        }

        if (groups == 0) {
            groups++;
        }
        System.out.println(groups);
    }
}
