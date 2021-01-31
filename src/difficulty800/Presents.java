package difficulty800;

import java.util.Arrays;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte friends = scanner.nextByte();
        byte[] result = new byte[friends];

        for (int i = 0; i < friends; i++) {
            byte k = scanner.nextByte();
            result[k - 1] = (byte) ( i + 1);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
