package codeforces.difficulty800;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();


        int cost = 0;
        for (int i = 1; i <= w; i++) {
            cost += i * k;
        }

        System.out.println(cost <= n ? 0 : cost - n);
    }
}
