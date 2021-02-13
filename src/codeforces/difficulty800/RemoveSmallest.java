package codeforces.difficulty800;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int length = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                array.add(scanner.nextInt());
            }

            System.out.println(solve(array));
        }
    }

    private static String solve(ArrayList<Integer> array) {
        array.sort(null);
        boolean ok = true;
        for (int i = 1; i < array.size(); i++)
            ok &= (array.get(i) - array.get(i - 1) <= 1);

        return (ok ? "YES" : "NO");
    }
}
