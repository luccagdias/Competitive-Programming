package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class Reconnaissance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] soldiers = new int[n];
        for (int i = 0; i < n; i++) {
            soldiers[i] = scanner.nextInt();
        }

        Arrays.sort(soldiers);

        int result = 0;
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (soldiers[j] - soldiers[i] <= d)
                    result += 2;
                else
                    break;
            }
        }

        System.out.println(result);
    }
}
