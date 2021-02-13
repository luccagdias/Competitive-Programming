package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SeriesOfCrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
                map[i] = scanner.nextLine().toCharArray();
        }

        ArrayList<Integer> xResult = new ArrayList<>();
        ArrayList<Integer> yResult = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '*'){
                    if (xResult.contains(i))
                        xResult.remove(Integer.valueOf(i));
                    else
                        xResult.add(i);

                    if (yResult.contains(j))
                        yResult.remove(Integer.valueOf(j));
                    else
                        yResult.add(j);
                }
            }
        }

        System.out.println((xResult.get(0) + 1 )+ " " + (yResult.get(0) + 1));
    }
}
