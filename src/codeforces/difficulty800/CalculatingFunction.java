package codeforces.difficulty800;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long total = 0;

        if (n % 2 != 0) {
            total = (n + 1) / -2;
        } else {
            total = n / 2;
        }

        System.out.println(total);
    }
}
