package codeforces.difficulty800;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        if (n % 2 != 0)
            System.out.println("-1");
        else {
            for (int i = 1; i < n; i+=2) {
                result.append(i + 1 + " ");
                result.append(i + " ");
            }

            System.out.println(result);
        }
    }
}
