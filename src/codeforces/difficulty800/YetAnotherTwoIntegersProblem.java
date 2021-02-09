package codeforces.difficulty800;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = 0;

            if (a != b) {
                StringBuilder temp = new StringBuilder();
                temp.append((b > a) ? String.valueOf(b - a) : String.valueOf(a - b));

                if (temp.charAt(temp.length() - 1) != '0') {
                    result = Integer.valueOf(temp.substring(0, temp.length() -1) + "0") / 10;
                    result++;
                } else
                    result = Integer.parseInt(temp.toString()) / 10;
            }

            System.out.println(result);
        }
    }
}
