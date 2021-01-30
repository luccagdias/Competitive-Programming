package difficulty800;

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int childrenInQueue = scanner.nextInt();
        int time = scanner.nextInt();
        scanner.nextLine();
        String queue = scanner.nextLine();
        char[] chars = new char[childrenInQueue];
        queue.getChars(0, queue.length(), chars, 0);

        for (int i = 0; i < time; i++) {
            int j = 0;
            while (j < childrenInQueue - 1) {
                if(chars[j] == 'B' && chars[j + 1] == 'G') {
                    chars[j] = 'G';
                    chars[j + 1] = 'B';
                    j += 2;
                } else {
                    j++;
                }
            }
        }
        System.out.println(new String(chars));
    }
}
