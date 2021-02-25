package codeforces.difficulty800;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            int n = input.nextInt();
            solve(n);
        }
    }

    private static void solve(int n) {
        int temp = n / 2;

        if (temp % 2 != 0)
            System.out.println("NO");
        else {
            System.out.println("YES");

            int evenSum = 0;
            int oddSum = 0;

            int ans = 2;
            for (int i = 0; i < n/2; i++) {
                System.out.print(ans + " ");
                evenSum += ans;
                ans += 2;
            }

            ans = 1;
            for (int i = n/2; i < n - 1; i++) {
                System.out.print(ans + " ");
                oddSum += ans;
                ans += 2;
            }


            System.out.println(Math.abs(evenSum - oddSum) + " ");
        }
    }
}
