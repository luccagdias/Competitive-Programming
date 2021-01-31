package codeforces.difficulty800;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short m = scanner.nextShort();
        short n = scanner.nextShort();

        if (m == 0 || n == 0 || (m == 1 && n == 1)) {
            System.out.println("0");
        } else {
            int maxDominoPieces = (m * n) / 2;
            System.out.println(maxDominoPieces);
        }
    }
}
