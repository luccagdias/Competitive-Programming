package difficulty800;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int subtractions = scanner.nextInt();

        for(int i = 0; i < subtractions; i++) {
            number = (number % 10 != 0) ? (number - 1) : (number /= 10);
        }

        System.out.println(number);
    }
}
