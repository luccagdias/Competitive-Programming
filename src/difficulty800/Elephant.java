package difficulty800;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coordinate = scanner.nextInt();
        int steps = (coordinate % 5 == 0) ? (coordinate / 5) : (coordinate / 5) + 1;

        System.out.println(steps);
    }
}
