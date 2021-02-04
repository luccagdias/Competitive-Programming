package codeforces.difficulty800;

import java.util.Scanner;

public class UltraFastMatematician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < secondNumber.length(); i++) {
            result.append(firstNumber.charAt(i) == secondNumber.charAt(i) ? "0" : "1");
        }

        System.out.println(result);
    }
}
