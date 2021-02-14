package codeforces.difficulty800;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String n = scanner.nextLine();


        System.out.println(solve(length, n));

    }

    private static String solve(int length, String n) {

        int firstHalfSum = 0;
        int secondtHalfSum = 0;
        for (int i = 0; i < length; i++) {
            if (n.charAt(i) != '4' && n.charAt(i) != '7')
                return "NO";

            if(i < length / 2)
                firstHalfSum += Integer.parseInt(n.charAt(i) + "");
            else
                secondtHalfSum += Integer.parseInt(n.charAt(i) + "");
        }

        return (firstHalfSum == secondtHalfSum ? "YES" : "NO");
    }
}
