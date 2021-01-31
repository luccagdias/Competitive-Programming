package codeforces.difficulty800;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int numOfLuckyDigits = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                numOfLuckyDigits++;
            }

            if (numOfLuckyDigits > 7) {
                break;
            }
        }

        System.out.println((numOfLuckyDigits == 4 || numOfLuckyDigits == 7) ? "YES" : "NO");
    }
}
