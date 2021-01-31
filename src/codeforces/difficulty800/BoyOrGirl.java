package codeforces.difficulty800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        Set<Character> result = new HashSet<Character>();

        for (int i = 0; i < userName.length(); i++) {
            result.add(userName.charAt(i));
        }

        if (result.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
