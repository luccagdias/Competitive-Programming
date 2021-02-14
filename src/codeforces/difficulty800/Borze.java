package codeforces.difficulty800;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        System.out.println(solve(code));
    }

    private static StringBuilder solve(String code) {
        StringBuilder result = new StringBuilder();
        char[] chars = new char[code.length() + 1];

        int k = 0;
        for (char ch: code.toCharArray()) {
            chars[k] = ch;
            k++;
        }

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '-' && chars[i + 1] == '.'){
                result.append(1);
                i++;
            } else if (chars[i] == '-' && chars[i + 1] == '-'){
                result.append(2);
                i++;
            } else {
                result.append(0);
            }
        }

        return result;
    }
}
