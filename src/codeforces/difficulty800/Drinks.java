package codeforces.difficulty800;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int drinks = scanner.nextInt();
        double percentage = 0.0;
        scanner.nextLine();

        for (int i = 0; i < drinks; i++) {
            percentage += scanner.nextDouble() / 100;
        }

        double result = (percentage / drinks) * 100;
        System.out.printf( "%.12f", result );
    }
}
