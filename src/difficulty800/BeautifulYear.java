package difficulty800;

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean found = false;
        while (!found) {
            year++;
            String testYear = String.valueOf(year);
            HashSet<Character> digits = new HashSet<>();

            for (int i = 0; i < 4; i++) {
                digits.add(testYear.charAt(i));
            }

            if (digits.size() == 4) {
                found = true;
            }
        }
        System.out.println(year);
    }
}
