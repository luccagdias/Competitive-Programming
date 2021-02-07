package codeforces.difficulty800;

import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            StringBuilder result = new StringBuilder();
            int number = 0;
            
            String n = scanner.nextLine();

            for (int j = 0; j < n.length(); j++) {
                if(n.charAt(j) != '0') {
                    result.append(n.charAt(j));

                    for (int k = 0; k < (n.length() - 1) - j; k++) {
                        result.append("0");
                    }

                    result.append(" ");
                    number++;
                }
            }

            System.out.println(number);
            System.out.println(result);
        }
    }
}