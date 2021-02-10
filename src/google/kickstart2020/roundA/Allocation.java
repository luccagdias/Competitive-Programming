package google.kickstart2020.roundA;

import java.util.Arrays;
import java.util.Scanner;

public class Allocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int houses = scanner.nextInt();
            int dollars = scanner.nextInt();

            int[] prices = new int[houses];
            for (int j = 0; j < houses; j++) {
                prices[j] = scanner.nextInt();
            }

            Arrays.sort(prices);

            int result = 0;
            for (int j = 0; j < prices.length; j++) {
                if (dollars - prices[j] >= 0) {
                    dollars -= prices[j];
                    result++;
                } else
                    break;
            }
            
            System.out.println("Case #" + (i + 1)+ ": " + result);
        }
    }
}
