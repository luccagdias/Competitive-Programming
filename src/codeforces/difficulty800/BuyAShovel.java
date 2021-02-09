package codeforces.difficulty800;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();

        int count = 1;
        int temp = k;
        while (temp % 10 != 0 && temp % 10 != r) {
            temp += k;
            count++;
        }

        System.out.println(count);
    }
}
