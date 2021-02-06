package codeforces.difficulty800;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String sentence = scanner.nextLine().toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for (char letter: sentence.toCharArray()) {
            letters.add(letter);
        }

        System.out.println(letters.size() == 26 ? "YES" : "NO");
    }
}
