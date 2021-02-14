package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.Scanner;

public class Sleuth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();

        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');


        question = question.substring(0, question.length()- 1).trim().toUpperCase();

        System.out.println(vowels.contains(question.charAt(question.length() - 1)) ? "YES" : "NO");

    }
}
