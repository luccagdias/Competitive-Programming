package codeforces.difficulty900;

import java.util.Scanner;

public class ConstructTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int length = scanner.nextInt();
            int substringLength = scanner.nextInt();
            int distinctLetters = scanner.nextInt();

            StringBuilder result = new StringBuilder();
            while (result.length() < length) {
                int firstLetter = 'a';
                int letters = 0;
                StringBuilder subString = new StringBuilder();
                for (int j = 0; j < Math.min(substringLength, length - result.length()); j++) {
                        subString.append(Character.toString(firstLetter));
                        letters++;

                        if (letters < distinctLetters) {
                            firstLetter++;
                        }
                    }

                result.append(subString);
            }
            System.out.println(result);
        }
    }
}
