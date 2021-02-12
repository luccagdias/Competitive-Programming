package codeforces.difficulty900;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long n = scanner.nextLong();

            if (n % 2 == 0)
                while (n % 2 == 0)
                    n /= 2;


            System.out.println((n > 1) ? "YES" : "NO");
        }
    }
}
