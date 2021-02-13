package codeforces.difficulty900;

import java.util.Scanner;

public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for (int i = 0; i < testcases; i++) {
            int grains = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int minDropped = grains * (a - b);
            int maxDropped = grains * (a + b);
            
            int minPackageWeight = (c - d);
            int maxPackageWeight = (c + d);


            System.out.println(solve(minDropped, maxDropped, minPackageWeight, maxPackageWeight));
        }
    }

    private static String solve(int minDropped, int maxDropped, int minPackageWeight, int maxPackageWeight) {
        if (maxDropped < minPackageWeight || minDropped > maxPackageWeight)
            return "NO";

        return "YES";
    }
}