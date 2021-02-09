package codeforces.difficulty900;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word.replaceAll("WUB", " ").replaceAll("  ", " ").trim());
    }
}
