package codeforces.difficulty800;

import java.util.Scanner;

public class BusToUdayland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] seats = new String[n];
        for (int i = 0; i < n; i++) {
            seats[i] = input.nextLine();
        }


        solve(n, seats);
    }

    private static void solve(int n, String[] seats) {

        boolean replaced = false;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i].contains("OO")){
                seats[i] = seats[i].replaceFirst("OO", "++");
                replaced = true;
                break;
            }
        }

        if(replaced) {
            System.out.println("YES");
            for (String s: seats) {
                System.out.println(s);
            }
        } else
            System.out.println("NO");
    }
}
