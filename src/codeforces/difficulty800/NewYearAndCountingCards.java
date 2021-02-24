package codeforces.difficulty800;

import javax.security.auth.callback.CallbackHandler;
import java.util.Scanner;

public class NewYearAndCountingCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println(solve(s));

    }

    private static int solve(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 97 && c <= 122) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    ans++;
            } else {
                if (Integer.valueOf(c + "") % 2 != 0)
                    ans++;
            }
        }

        return ans;
    }
}
