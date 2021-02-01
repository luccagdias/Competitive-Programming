package codeforces.difficulty800;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = scanner.nextInt();
        boolean isHard = false;

        for (int i = 0; i < numOfPeople; i++) {
            int opinion = scanner.nextInt();

            if (opinion == 1) {
                isHard = true;
                break;
            }
        }

        System.out.println((isHard) ? "HARD" : "EASY");
    }
}
