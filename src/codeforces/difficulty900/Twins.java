package codeforces.difficulty900;

import java.util.ArrayList;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numberOfCoins = scanner.nextInt();
        ArrayList<Integer> coinValues = new ArrayList<>();

        for (int i = 0; i < numberOfCoins; i++) {
            coinValues.add(scanner.nextInt());
        }
        coinValues.sort(null);

        int mySum = 0, brotherSum = 0, k = coinValues.size() - 1;

        while (mySum <= brotherSum) {
            mySum = 0;
            brotherSum = 0;

            for (int i = 0; i < k; i++) {
                brotherSum += coinValues.get(i);
            }

            for (int i = k; i < coinValues.size(); i++) {
                mySum += coinValues.get(i);
            }

            k--;
        }

        System.out.println(coinValues.size() - (k + 1));
    }
}
