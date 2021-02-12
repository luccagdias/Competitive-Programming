package codeforces.difficulty900;

import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int[] months = new int[12];
        for (int i = 0; i < 12; i++) {
            months[i] = scanner.nextInt();
        }
        Arrays.sort(months);

        System.out.println(solve(k, months));
    }

    public static int solve(int k, int[] months) {
        if (k == 0)
            return 0;

        int grow = 0;
        int count = 0;
        for (int i = 11; i >= 0; i--) {
            grow += months[i];
            count++;

            if (grow >= k)
                return count;
        }

        return -1;
    }
}