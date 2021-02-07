package codeforces.contests.round700;

import java.util.Scanner;

public class YetAnotherStringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String input = scanner.nextLine();
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    result.append((input.charAt(j) == 'a') ? "b" : "a");
                } else {
                    result.append((input.charAt(j) == 'z') ? "y" : "z");
                }
            }

            System.out.println(result);
        }
    }
}
