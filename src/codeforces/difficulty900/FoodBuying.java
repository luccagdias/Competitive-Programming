package codeforces.difficulty900;

import java.util.Scanner;

public class FoodBuying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int burles = scanner.nextInt();
            System.out.println(solve(burles));
        }

    }

    private static int solve(int burles) {
        int length = String.valueOf(burles).length();
        int spend = (int) Math.pow(10, length - 1);

        int result = 0;
        while (burles > 0) {
            if (burles >= spend) {
                burles = (burles - spend) + (spend / 10);
                result += spend;
            }
            else
                spend /= 10;
        }

        return result;
    }
}
