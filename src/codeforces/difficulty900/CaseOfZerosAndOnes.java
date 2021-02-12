package codeforces.difficulty900;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseOfZerosAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        StringBuilder string = new StringBuilder(scanner.nextLine());

        int totalOnes = 0;
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == '1')
                totalOnes++;


        int totalZeros = length - totalOnes;
        int result = string.length() - (Math.min(totalZeros, totalOnes) * 2);

        System.out.println(result);
    }
}
