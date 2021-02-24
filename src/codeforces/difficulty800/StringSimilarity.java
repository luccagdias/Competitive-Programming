package codeforces.difficulty800;

import java.util.Scanner;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            String s = input.nextLine();

            System.out.println(solve(n, s));
        }
    }

    private static StringBuilder solve(int n, String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2)
            ans.append(s.charAt(i));


        return ans;
    }
}
