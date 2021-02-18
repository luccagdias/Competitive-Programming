package codeforces.difficulty800;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(solve(n, array));
    }

    private static int solve(int n, int[] array) {
        int ans = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] < array[i + 1])
                max++;
            else{
                if (max > ans)
                    ans = max;

                max = 1;
            }
        }

        if (max > ans)
            ans = max;

        return ans;
    }
}
