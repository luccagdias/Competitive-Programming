package codeforces.difficulty800;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(solve(name));
    }

    private static int solve(String name) {
        int ans = 0;
        char lastChar = 'a';
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            ans += Math.min(Math.abs(lastChar - c), 26 - Math.abs(Math.abs(lastChar - c)));
            lastChar = c;
        }

        return ans;
    }
}
