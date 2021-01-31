package codeforces.difficulty900;

import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        //int[] money = new int[days];
        int maximumSequence = 0;
        int sequence = 0;
        int lastMoneyValue = 0;
        for (int i = 0; i < days; i++) {
            int money = scanner.nextInt();
            if (money >= lastMoneyValue) {
                sequence++;
            } else {
                sequence = 1;
            }

            if (sequence > maximumSequence) {
                maximumSequence = sequence;
            }
            lastMoneyValue = money;
        }
        System.out.println(maximumSequence);
    }
}
