package codeforces.difficulty800;

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problems = scanner.nextInt();
        int minutes = scanner.nextInt();


        //4 hours = 240 minutes
        int timeRemaining = 240 - minutes;
        int timeSpent = 0;
        int problemsSolved = 0;
        int count = 1;
        boolean solvedAllProblems = false;

        while (!solvedAllProblems) {
            timeSpent += count * 5;
            if (timeRemaining < timeSpent)
                break;

            problemsSolved++;
            count++;

            if (problemsSolved == problems)
                solvedAllProblems = true;
        }


        System.out.println(problemsSolved);
    }
}
