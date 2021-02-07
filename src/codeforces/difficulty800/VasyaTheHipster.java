package codeforces.difficulty800;

import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int differentSocks = Math.min(a, b);
        int sameSocks = (Math.max(a, b) - Math.min(a, b)) / 2;

        System.out.println(differentSocks + " " + sameSocks);
    }
}
