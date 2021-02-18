package codeforces.difficulty800;

import java.util.Scanner;

public class SummerCamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(solve(n));
    }

    private static char solve(int n) {
        StringBuilder string = new StringBuilder();

        int count = 1;
        while (string.length() < n){
            string.append(count);
            count++;
        }

        return string.charAt(n - 1);
    }
}
