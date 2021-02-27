package atcoder.contest193;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println(solve(a, b));
    }

    private static double solve(double a, double b) {
        double c = (100 * b) / a;
        double ans = 100.0 - c;

        return ans;
    }
}
