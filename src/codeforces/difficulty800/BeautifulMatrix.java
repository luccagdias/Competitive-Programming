package codeforces.difficulty800;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowPosition = 0;
        int columnPosition = 0;
        int centralIndex = 3;

        outer:
        for (byte row = 0; row < 5; row++) {
            String[] rowValues = scanner.nextLine().split(" ");

            for (byte column = 0; column < 5; column++) {
                if (rowValues[column].equals("1")) {
                    rowPosition = row + 1;
                    columnPosition = column + 1;
                    break outer;
                }
            }
        }

        int numberOfMoves = Math.abs(centralIndex - rowPosition) + Math.abs(centralIndex - columnPosition);
        System.out.println(numberOfMoves);
    }
}
