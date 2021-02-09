package codeforces.difficulty900;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int min = Math.min(n, m);

        System.out.println((min % 2 != 0) ? "Akshat" : "Malvika");

    }
}
