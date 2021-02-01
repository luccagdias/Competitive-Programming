package codeforces.difficulty800;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int layers = scanner.nextInt();
        StringBuilder result = new StringBuilder("I hate ");

        if (layers > 1) {
            for (int i = 2; i <= layers; i++) {
                if (i % 2 != 0) {
                    result.append("that I hate ");
                } else {
                    result.append("that I love ");
                }
            }
        }

        result.append("it");
        System.out.println(result);
    }
}
