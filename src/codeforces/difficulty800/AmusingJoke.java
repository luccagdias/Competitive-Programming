package codeforces.difficulty800;

import java.util.*;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] guest = scanner.nextLine().toCharArray();
        char[] host = scanner.nextLine().toCharArray();
        char[] letters = scanner.nextLine().toCharArray();

        if ((guest.length + host.length) > letters.length) {
            System.out.println("NO");
        } else {
            ArrayList<Character> characters = new ArrayList<>();

            for (char letter: letters) {
                characters.add(letter);
            }

            for (char c: guest) {
                characters.remove(Character.valueOf(c));
            }

            for (char c: host) {
                characters.remove(Character.valueOf(c));
            }

            System.out.println((characters.size() > 0) ? "NO" : "YES");
        }
    }
}
