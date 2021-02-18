package codeforces.difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xi = new int[3];

        for (int i = 0; i < 3; i++) {
            xi[i] = scanner.nextInt();
        }

        System.out.println(solve(xi));
    }

    private static int solve(int[] xi) {
        Arrays.sort(xi);

        return xi[1] - xi[0] + xi[2] - xi[1];
    }
}
