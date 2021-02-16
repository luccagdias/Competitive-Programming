package codeforces.difficulty800;

import java.util.Scanner;

public class PolandBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        boolean isPrime = true;
        while (isPrime) {
            count++;
            int temp = n * count + 1;

            for (int i = 2; i <= temp / 2; i++)
                if(temp % i == 0)
                    isPrime = false;

        }

        System.out.println(count);
    }
}
