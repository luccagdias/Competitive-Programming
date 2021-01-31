package codeforces.difficulty900;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int playersOfSomeTeam = 0;
        char lastPlayerTeam = '2';

        for (int i = 0; i < string.length(); i++) {
            if (playersOfSomeTeam == 7) {
                break;
            }

            if (string.charAt(i) == lastPlayerTeam) {
                playersOfSomeTeam++;
            } else {
                playersOfSomeTeam = 1;
            }
            lastPlayerTeam = string.charAt(i);
        }

        System.out.println((playersOfSomeTeam == 7) ? "YES" : "NO");
    }
}
