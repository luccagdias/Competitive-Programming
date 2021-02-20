package atcoder.contest192;

import java.util.Scanner;

public class UnreadableString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(solve(s));
    }

    private static String solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);


            if ( (i + 1) % 2 != 0 && !Character.isLowerCase(s.charAt(i)))
                return "No";

            if ( (i + 1) % 2 == 0 && !Character.isUpperCase(s.charAt(i)))
                return "No";
        }

        return "Yes";
    }
}
