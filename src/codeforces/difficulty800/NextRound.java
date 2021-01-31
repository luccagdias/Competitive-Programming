package codeforces.difficulty800;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte participantsInNextRound = 0;
        byte numberOfParticipants = scanner.nextByte();
        byte[] scores = new byte[numberOfParticipants];
        byte lastPlacedScore = scanner.nextByte();
        for (int i = 0; i < numberOfParticipants; i++) {
            scores[i] = scanner.nextByte();
        }

        if(scores[0] != 0) {
                for (int i = 0; i < numberOfParticipants; i++) {
                    if (scores [i] < scores[lastPlacedScore - 1] || scores[i] == 0) {
                        break;
                    }

                    participantsInNextRound++;
                }

                System.out.println(participantsInNextRound);
        } else {
            System.out.println("0");
        }
    }
}
