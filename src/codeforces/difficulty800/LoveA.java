package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class LoveA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println(solve(s));
    }

    private static int solve(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int a = 0;
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == 'a')
                a++;
            else
                break;


        int x = a - 1;
        int ans = (a > s.length() / 2) ? s.length() : a + x;
        return ans;
    }
}
