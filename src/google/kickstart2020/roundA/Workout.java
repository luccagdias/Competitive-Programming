package google.kickstart2020.roundA;

import java.util.ArrayList;
import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int sessions = scanner.nextInt();
            int additionalTraining = scanner.nextInt();

            ArrayList<Integer> minutesOfEachSession = new ArrayList<>();
            for (int j = 0; j < sessions; j++) {
                minutesOfEachSession.add(scanner.nextInt());
            }

            int maximum = 0;
            int indexOfMaximum = 0;
            while (additionalTraining > 0) {
                maximum = 0;
                indexOfMaximum = 0;

                for (int j = 0; j < (minutesOfEachSession.size() - 1); j++) {
                    if (minutesOfEachSession.get(j + 1) - minutesOfEachSession.get(j) > maximum) {
                        maximum = minutesOfEachSession.get(j + 1) - minutesOfEachSession.get(j);
                        indexOfMaximum = j;
                    }
                }

                int sessionMinutesToAdd = minutesOfEachSession.get(indexOfMaximum) + (maximum / 2);
                minutesOfEachSession.add(indexOfMaximum + 1, sessionMinutesToAdd);
                additionalTraining--;
            }

            int result = 0;
            for (int j = 0; j < (minutesOfEachSession.size() - 1); j++) {
                if (minutesOfEachSession.get(j + 1) - minutesOfEachSession.get(j) > result) {
                    result = minutesOfEachSession.get(j + 1) - minutesOfEachSession.get(j);
                }
            }

            System.out.println("Case #" + (i + 1)+ ": " + result);
        }

    }
}
