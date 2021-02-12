package codeforces.difficulty900;

import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int state = scanner.nextInt();

        if (state >= 0) {
            System.out.println(state);
        }
        else {
            String stateAsString = String.valueOf(Math.abs(state));
            StringBuilder sb = new StringBuilder(stateAsString.substring(0, stateAsString.length() - 2));
            StringBuilder lastTwoDigits = new StringBuilder(stateAsString.substring(stateAsString.length() - 2, stateAsString.length()));


            if (Character.valueOf(lastTwoDigits.charAt(0)) >= Character.valueOf(lastTwoDigits.charAt(1))) {
                sb.append(lastTwoDigits.charAt(1));
            } else {
                sb.append(lastTwoDigits.charAt(0));
            }


            System.out.println(sb.compareTo(new StringBuilder("0")) == 0 ? sb : "-" + sb);
        }
    }
}
