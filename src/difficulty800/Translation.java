package difficulty800;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder original = new StringBuilder(scanner.nextLine()).reverse();
        StringBuilder translation = new StringBuilder(scanner.nextLine());

        System.out.println((original.compareTo(translation) == 0) ? "YES" : "NO");
    }
}
