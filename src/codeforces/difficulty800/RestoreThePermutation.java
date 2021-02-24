package codeforces.difficulty800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RestoreThePermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        
        while (tests-- > 0) {
            System.out.println(solve(input));
        }

    }

    private static StringBuilder solve(Scanner input) {
        int n = input.nextInt();

        StringBuilder ans = new StringBuilder();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < 2*n; i++) {
            int temp = input.nextInt();
            if (!p.contains(temp))
                p.add(temp);
        }

        for (int i: p) {
            ans.append(i + " ");
        }

        return ans;
    }
}
