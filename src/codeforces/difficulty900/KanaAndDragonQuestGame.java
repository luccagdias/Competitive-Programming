package codeforces.difficulty900;

import java.util.Scanner;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int hit = scanner.nextInt();
            int voidAbsorptions = scanner.nextInt();
            int lightningStrikes = scanner.nextInt();

            while (voidAbsorptions-- > 0 && hit > 20)
                hit = (hit / 2) + 10;

            while (lightningStrikes-- > 0)
                hit -=10;

            System.out.println((hit > 0) ? "NO" : "YES");
        }
    }
}
