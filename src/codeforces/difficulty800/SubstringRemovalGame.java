package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SubstringRemovalGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();

        while (tests-- > 0) {
            String s = input.nextLine();
            System.out.println(solve(s));
        }
    }

    private static int solve(String s) {
        if (!s.contains("0"))
            return s.length();

        if (!s.contains("1"))
            return 0;

        ArrayList<Integer> blocks = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                int j = i;
                while (j + 1 < s.length() && s.charAt(j + 1) == '1')
                    j++;

                blocks.add(j - i + 1);
                i = j;
            }
        }

        int ans = 0;
        blocks.sort(Comparator.reverseOrder());
        for (int i = 0; i < blocks.size(); i += 2) {
            ans += blocks.get(i);
        }

        return ans;
    }
}
