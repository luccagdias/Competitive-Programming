package atcoder.contest191;

import java.util.Scanner;

public class VanishingPitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextInt();
        double t = scanner.nextInt();
        double s = scanner.nextInt();
        double d = scanner.nextInt();

        double secondToReachDistance = d / v;
        if (secondToReachDistance >= t && secondToReachDistance <= s) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
