package difficulty800;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int upperCaseLetters = 0;

        for (int i = 0; i < word.length(); i++) {
            Character letter = word.charAt(i);
            if (isUpperCase(word.charAt(i))) {
                upperCaseLetters++;
            }
        }

        if(upperCaseLetters > (word.length() / 2)) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
