package codeforces.difficulty800;

import java.util.Scanner;

public class GoodMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = scanner.nextInt();
                if (i == j || i == n / 2 || j == n / 2 || i == n - j - 1)
                    result += temp;
            }

        }

        System.out.println(result);
    }
}
