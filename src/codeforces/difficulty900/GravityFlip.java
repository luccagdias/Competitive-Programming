package codeforces.difficulty900;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            result.add(scanner.nextInt());
        }
        result.sort(null);

        for (int i = 0; i < columns; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}