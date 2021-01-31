package codeforces.difficulty800;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte rooms = scanner.nextByte();
        byte total = 0;

        for (int i = 0; i < rooms; i++) {
            byte people = scanner.nextByte();
            byte capacity = scanner.nextByte();

            if (capacity - people >= 2) {
                total++;
            }
        }

        System.out.println(total);
    }
}
