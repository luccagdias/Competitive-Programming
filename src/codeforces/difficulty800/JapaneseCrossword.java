package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.Scanner;

public class JapaneseCrossword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();

        solve(length, string.toCharArray());
    }

    private static void solve(int length, char[] characters) {
        int i = 0;
        ArrayList<Integer> lengths = new ArrayList<>();

        while (i < length) {
            if (characters[i] == 'B') {
                int j = i;

                while (j < length && characters[j] == 'B')
                    j++;

                lengths.add(j - i);
                i = j;
            } else
                i++;
        }

        System.out.println(lengths.size());
        for (int n : lengths) {
            System.out.print(n + " ");
        }
    }
}
