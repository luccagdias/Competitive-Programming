package atcoder.contest192;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int k = scanner.nextInt();

        System.out.println(solve(n, k));
    }

    private static String solve(String n, int k) {

        for (int i = 0; i < k; i++) {
            char[] nums = n.toCharArray();
            Arrays.sort(nums);

            String asc = "";
            String desc = "";
            for (int l = 0, j = n.length() - 1; l < n.length(); l++, j--) {
                asc += nums[l];
                desc += nums[j];
            }

            n = String.valueOf(Integer.valueOf(desc) - Integer.valueOf(asc));
        }

        return n;
    }
}
