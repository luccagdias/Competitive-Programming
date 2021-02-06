package atcoder.contest191;

import java.util.Scanner;

public class RemoveIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int elementToRemove = scanner.nextInt();

        if (length == 0) {
            System.out.println();
        } else{
            for (int i = 0; i < length; i++) {
                int element = scanner.nextInt();

                if (element != elementToRemove) {
                    System.out.print(element + " ");
                }
            }
        }
    }
}
