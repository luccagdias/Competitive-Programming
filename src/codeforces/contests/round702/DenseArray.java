package codeforces.contests.round702;

import java.util.ArrayList;
import java.util.Scanner;

public class DenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();

            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                array.add(scanner.nextInt());
            }

            for (int j = 0; j < array.size() - 1; j++) {
                double max = Math.max(array.get(j), array.get(j + 1));
                double min = Math.min(array.get(j), array.get(j + 1));

                if(max / min > 2.0) {
                    if (array.get(j) < array.get(j + 1)){
                        array.add(j + 1, (int) (min * 2.0));
                    } else {
                        if (max % 2 == 0) {
                            array.add(j + 1, (int) (max / 2.0));
                        } else {
                            array.add(j + 1, (int) (max / 2.0) + 1);
                        }
                    }
                }
            }

            System.out.println(array.size() - n);
        }
    }

    //Solution from the Editorial
    /*
    private static int solve(Scanner input) {
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++)
            array[i] = input.nextInt();

        int ans = 0;
        for (int i = 0; i < length - 1; i++){
            int min = Math.min(array[i], array[i + 1]);
            int max = Math.max(array[i], array[i + 1]);

            while (2 * min < max){
                min *= 2;
                ans++;
            }
        }

        return ans;
    }
     */
}
