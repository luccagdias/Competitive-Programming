package codeforces.difficulty900;

import java.util.Scanner;

public class Game01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        while (testCases-- > 0) {
            String string = scanner.nextLine();
            solve(string);
        }
    }

    public static void solve(String s) {

        int totalZeros = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '0')
                totalZeros++;

        int totalOnes = s.length() - totalZeros;

        int possiblePairs = Math.min(totalZeros, totalOnes);

        System.out.println(possiblePairs % 2 != 0 ? "DA" : "NET");
    }
}