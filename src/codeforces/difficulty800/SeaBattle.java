package codeforces.difficulty800;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] wh = new int[4];
        for (int i = 0; i < 4; i++) {
            wh[i] = input.nextInt();
        }

        System.out.println(solve(wh));
    }

    private static int solve(int[] wh) {
        int totalH = wh[1] + wh[3];
        int totalW = wh[0];

        int ans = 2 * (totalH + totalW) + 4;
        return ans;
    }
}
