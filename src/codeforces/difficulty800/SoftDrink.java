package codeforces.difficulty800;

import java.util.Scanner;

public class SoftDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();


        int millilitersPerToast = (k * l) / nl;
        int lemonsSlices = c * d;
        int saltPerToast = p / np;

        System.out.println(Math.min(Math.min(millilitersPerToast, lemonsSlices), saltPerToast) / n);
    }
}
