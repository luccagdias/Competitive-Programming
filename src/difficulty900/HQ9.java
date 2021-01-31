package difficulty900;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean produceOutput = false;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'H' || letter == 'Q' || letter == '9') {
                produceOutput = true;
                break;
            }
        }

        System.out.println((produceOutput) ? "YES" : "NO");
    }
}
