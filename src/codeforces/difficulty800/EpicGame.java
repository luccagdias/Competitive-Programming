package codeforces.difficulty800;

import java.util.Scanner;

public class EpicGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int simon = scanner.nextInt();
        int antisimon = scanner.nextInt();
        int stones = scanner.nextInt();

        while (stones > 0) {
            for (int i = Math.min(simon, stones); i > 0 ; i--) {
                if (simon % i == 0 && stones % i == 0) {
                    stones -= i;
                    break;
                }
            }

            if (stones == 0) {
                System.out.println("0");
                break;
            }

            for (int i = Math.min(antisimon, stones); i > 0 ; i--) {
                if (antisimon % i == 0 && stones % i == 0) {
                    stones -= i;
                    break;
                }
            }

            if (stones == 0) {
                System.out.println("1");
                break;
            }
        }

    }
}
