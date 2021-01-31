package codeforces.difficulty800;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        short result = 0;
        Scanner scanner = new Scanner(System.in);
        short numberOfStatements = scanner.nextShort();
        scanner.nextLine();

        for (int i = 0; i < numberOfStatements; i++) {
            String statement = scanner.nextLine();

            if (statement.contains("+")) {
                result++;
            } else {
                result--;
            }
        }

        System.out.println(result);
    }
}
