package codeforces.difficulty800;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] calories = new int[5];
        for (int i = 1; i <= 4; i++) {
            calories[i] = input.nextInt();
        }

        input.nextLine();
        String s = input.nextLine();

        System.out.println(solve(calories, s));
    }

    private static int solve(int[] calories, String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = Integer.valueOf(s.charAt(i) + "");
            ans += calories[temp];
        }

        return ans;
    }
}
