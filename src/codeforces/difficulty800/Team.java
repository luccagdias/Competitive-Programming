package codeforces.difficulty800;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short numberOfProblems = scanner.nextShort();
        short problemsImplemented = 0;

        for (int i = 0; i < numberOfProblems; i++) {
            short petya = scanner.nextShort();
            short vasya = scanner.nextShort();
            short tonya = scanner.nextShort();

            if ((petya + vasya + tonya) > 1) {
                problemsImplemented++;
            }
        }

        System.out.println(problemsImplemented);
    }
}
