package codeforces.difficulty800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputSet = input.substring(1, input.length() - 1);

        if (inputSet.equals("")) {
            System.out.println("0");
        } else {
            HashSet<String> result = new HashSet<>(Arrays.asList(inputSet.split(", ")));
            System.out.println(result.size());
        }

    }
}
