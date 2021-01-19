package difficulty800;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < lines; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                String firstLetter = word.substring(0, 1);
                String lastLetter = word.substring(word.length() - 1);
                int charsBetweenFirstAnsLast = word.length() - 2;
                System.out.println(firstLetter + charsBetweenFirstAnsLast + lastLetter);
            } else {
                System.out.println(word);
            }
        }
    }
}
