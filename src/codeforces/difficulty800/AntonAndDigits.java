package codeforces.difficulty800;

import java.util.Scanner;

public class AntonAndDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k2 = input.nextInt();
        int k3 = input.nextInt();
        int k5 = input.nextInt();
        int k6 = input.nextInt();

        System.out.println(solve(k2, k3, k5, k6));
    }

    private static int solve(int k2, int k3, int k5, int k6) {
        int total256 = 256;
        int min = Math.min(Math.min(k2, k5), k6);

        k2 -= min;
        k5 -= min;
        k6 -= min;

        int total32 = 0;
        while (k2 > 0 && k3 > 0) {
            k2--;
            k3--;
            total32++;
        }

        total256 *= min;
        total32 *= 32;
        
        return total32 + total256;
    }
}
