package codeforces.difficulty800;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStops = scanner.nextInt();
        int totalPassengers = 0;
        int minimumCapacity = 0;

        for (int i = 0; i < numberOfStops; i++) {
            totalPassengers -= scanner.nextInt();;
            totalPassengers += scanner.nextInt();

            if (totalPassengers > minimumCapacity) {
                minimumCapacity = totalPassengers;
            }
        }

        System.out.println(minimumCapacity);
    }
}
