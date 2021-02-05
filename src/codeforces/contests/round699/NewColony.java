package codeforces.contests.round699;

import java.util.Scanner;

public class NewColony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int mountains = scanner.nextInt();
            int boulders = scanner.nextInt();
            int lastPosition = 0;
            int[] heights = new int[mountains];

            for (int j = 0; j < mountains; j++) {
                heights[j] = scanner.nextInt();
            }

            while (boulders > 0) {
                boolean added = false;
                for (int j = 0; j < (heights.length - 1); j++) {
                    if (heights[j] < heights[j + 1]) {
                        heights[j]++;
                        lastPosition = j + 1;
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    System.out.println("-1");
                    break;
                }

                if (boulders == 1) {
                    System.out.println(lastPosition);
                }

                boulders--;
            }
        }
    }
}

