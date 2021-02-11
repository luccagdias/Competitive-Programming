package codeforces.difficulty900;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        Candies candies = new Candies();

        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt();
            candies.solve(n);
        }
    }

    public void solve(int n) {
        int wrappers = n;

        for (int i = 2; i < 30; i++) {
            int val = (int) Math.pow(2, i) - 1;
            if (n % val == 0) {
                System.out.println(n / val);
                break;
            }
        }

    }
}
