package codeforces.difficulty800;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short numOfFriends = scanner.nextShort();
        short heightOfFence = scanner.nextShort();
        int sizeOfRoad = 0;

        for (int i = 0; i < numOfFriends; i++) {
            short heightOfFriend = scanner.nextShort();
            sizeOfRoad = (heightOfFriend > heightOfFence) ? (sizeOfRoad += 2) : (sizeOfRoad + 1);
        }

        System.out.println(sizeOfRoad);
    }
}
