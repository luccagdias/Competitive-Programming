package codeforces.difficulty900;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] tvs = new int[n];
        for (int i = 0; i < n; i++) {
            tvs[i] =scanner.nextInt();
        }
        Arrays.sort(tvs);

        System.out.println(solve(n, m, tvs));
    }

    public static int solve(int n, int m, int[] tvs) {
        int result = 0;
        int totalTvs = 1;
        for (int i = 0; i < n; i++) {
            if (tvs[i] < 0 && totalTvs <= m) {
                totalTvs++;
                result += tvs[i];
            }
            else
                break;
        }

        return Math.abs(result);
    }
}