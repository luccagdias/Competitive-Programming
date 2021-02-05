package codeforces.difficulty800;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldiers = scanner.nextInt();
        int minHeight = 100;
        int minHeightIndex = 0;

        int maxHeight = 0;
        int maxHeightIndex = 0;

        for (int i = 0; i < soldiers; i++) {
            int height = scanner.nextInt();

            if (height <= minHeight) {
                minHeight = height;
                minHeightIndex = i;
            }

            if (height > maxHeight) {
                maxHeight = height;
                maxHeightIndex = i;
            }
        }

        int length = soldiers - 1;
        if (maxHeightIndex > minHeightIndex) {
            System.out.println(maxHeightIndex + (length - minHeightIndex)  - 1);
        } else {
            System.out.println(maxHeightIndex + (length - minHeightIndex));
        }

        //System.out.println("A");
    }
}
