package codeforces.difficulty900;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.nextLine();
        String text = scanner.nextLine();

        char[][] keyboard = {
                {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
                {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';'},
                {'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/'}
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            outer:
            for (int j = 0; j < keyboard.length; j++)
                for (int k = 0; k < keyboard[j].length; k++)
                    if(keyboard[j][k] == letter) {
                        result.append(direction.compareTo("R") == 0 ? keyboard[j][k - 1] : keyboard[j][k + 1]);
                        break outer;
                    }

        }

        System.out.println(result);
    }
}
