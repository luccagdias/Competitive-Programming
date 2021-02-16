package codeforces.difficulty800;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int die = 6;

        int t = die - Math.max(y, w) + 1;

        if (die % t == 0){
            die /= t;
            t /= t;
        } else if (die % 2 == 0 && t % 2 == 0){
            die /= 2;
            t /= 2;
        }

        System.out.println(t + "/" + die);
    }
}
