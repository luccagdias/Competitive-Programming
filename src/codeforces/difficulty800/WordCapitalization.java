package codeforces.difficulty800;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String firstLetter = word.substring(0, 1);
        System.out.println(firstLetter.toUpperCase() + word.substring(1));
    }
}
