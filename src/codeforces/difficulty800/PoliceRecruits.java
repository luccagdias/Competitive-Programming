package codeforces.difficulty800;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] events = new int[n];
        for (int i = 0; i < n; i++) {
            events[i] = input.nextInt();
        }

        System.out.println(solve(n, events));
    }

    private static int solve(int n, int[] events) {
        int ans = 0;
        int police = 0;

        for (int i: events) {
            if (i > 0)
                police += i;
            else if (police == 0)
                ans++;
            else
                police--;
        }
        return ans;
    }
}
