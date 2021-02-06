package codeforces.difficulty800;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = scanner.nextInt();
        int games = teams * (teams - 1);
        int[] homeUniforms = new int[teams];
        int[] guestUniforms = new int[teams];
        int result = 0;

        for (int i = 0; i < teams; i++) {
            homeUniforms[i] = scanner.nextInt();
            guestUniforms[i] = scanner.nextInt();
        }

        Arrays.sort(homeUniforms);
        Arrays.sort(guestUniforms);

        for (int i = 0; i < teams; i++) {
            for (int j = 0; j < teams; j++) {
                if (homeUniforms[i] < guestUniforms[j]) {
                    break;
                }

                if (homeUniforms[i] == guestUniforms[j]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
