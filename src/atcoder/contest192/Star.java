package atcoder.contest192;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        if(x % 100 == 0) {
            x++;
            ans++;
        }

        while (x % 100 != 0) {
            x++;
            ans++;
        }

        System.out.println(ans);
    }
}
