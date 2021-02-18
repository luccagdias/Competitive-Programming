package codeforces.difficulty800;

import java.util.Scanner;

public class OstapAndGrasshopper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cells = input.nextInt();
        int jumpLength = input.nextInt();
        input.nextLine();

        char[] characters = input.nextLine().toCharArray();

        System.out.println(solve(cells, jumpLength, characters));
    }

    private static String solve(int n, int k, char[] characters) {
        int grasshopperIndex = -1, insectIndex = -1;
        for (int i = 0; i < n; i++) {

            if (characters[i] == 'G')
                grasshopperIndex = i + 1;

            if (characters[i] == 'T')
                insectIndex = i + 1;
        }

        if (Math.abs(grasshopperIndex - insectIndex) % k != 0)
            return "NO";

        int min = Math.min(grasshopperIndex, insectIndex) - 1;
        int max = Math.max(grasshopperIndex, insectIndex) - 1;

        while (min != max && min < n) {
            if (characters[min] == '#')
                return "NO";

            min = (min + k);
        }

        return "YES";
    }
}
