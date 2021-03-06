package codeforces.difficulty900;

import java.util.Scanner;

public class TilingChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            board[i] = input.nextLine().toCharArray();
        }

        System.out.println(sovle(n, board));
    }

    private static String sovle(int n, char[][] board) {
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (board[i][j] == '.')
                    if (board[i - 1][j] == '.' && board[i][j - 1] == '.' && board[i + 1][j] == '.' && board[i][j + 1] == '.') {
                        board[i][j] = '#';
                        board[i - 1][j] = '#';
                        board[i][j - 1] = '#';
                        board[i + 1][j] = '#';
                        board[i][j + 1] = '#';
                    }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.')
                    return "NO";
            }
        }

        return "YES";
    }
}
