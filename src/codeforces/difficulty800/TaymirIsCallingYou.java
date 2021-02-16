package codeforces.difficulty800;

import java.util.Scanner;

public class TaymirIsCallingYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z = scanner.nextInt();

        int[] calls = new int[z + 1];

        for (int i = 1; i <= z; i++) {
            if (i % n == 0)
                calls[i] = 1;

            if (i % m == 0)
                calls[i] += 1;
        }

        int result = 0;
        for (int i: calls) {
            if (i == 2)
                result++;
        }

        System.out.println(result);
    }
}
