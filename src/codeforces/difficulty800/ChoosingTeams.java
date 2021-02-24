package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        ArrayList<Integer> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();

            if (temp <= 5 - k)
                persons.add(temp);
        }

        System.out.println(solve(n, k, persons));
    }

    private static int solve(int n, int k, ArrayList<Integer> persons) {
        return persons.size() / 3;
    }
}
