package codeforces.difficulty800;

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contests = scanner.nextInt();

        int amazing = 0;


        int score = scanner.nextInt();
        int more = score;
        int less = score;
        for (int i = 0; i < contests - 1; i++) {
            score = scanner.nextInt();

            if (score > more) {
                more = score;
                amazing++;
            }

            if (score < less) {
                less = score;
                amazing++;
            }
        }

        System.out.println(amazing);

    }
}
