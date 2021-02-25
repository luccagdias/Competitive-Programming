package codeforces.difficulty800;

import java.util.Scanner;

public class DivideIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            long n = input.nextLong();
            System.out.println(solve(n));
        }
    }

    private static long solve(long n) {

        long ans = 0L;
        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0){
            while (n % 2 == 0) {
                n /= 2;
                ans++;
            }

            while (n % 3 == 0) {
                n = (2 * n) / 3;
                ans++;
            }

            while (n % 5 == 0) {
                n = (4 * n) / 5;
                ans++;
            }
        }

        return (n > 1) ? -1 : ans;
    }
}
