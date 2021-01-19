package difficulty800;

import java.util.Scanner;

public class Watermelon {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int watermelonWeight = scanner.nextInt();

        if(watermelonWeight % 2 == 0 && watermelonWeight != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
