import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int moves = 0;

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a % b != 0) {
                a++;
                moves++;
            }

            System.out.println(moves);
        }
        
    }
}
