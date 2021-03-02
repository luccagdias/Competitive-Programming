package codeforces.difficulty800;

import java.util.HashSet;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();

        while (tests-- > 0) {
            int n = input.nextInt();
            HashSet<Integer> subarray = new HashSet<>();
            for (int i = 0; i < n; i++) {
                subarray.add(input.nextInt());

            }

            System.out.println(solve(n, subarray));
        }
    }

    private static int solve(int n, HashSet<Integer> subarray) {
        return subarray.size();
    }
}
