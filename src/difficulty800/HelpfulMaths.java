package difficulty800;

import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\+");
        ArrayList<String> inputAsList = new ArrayList<>(Arrays.asList(input));
        Collections.sort(inputAsList);

        StringBuilder result = new StringBuilder();
        result.append(inputAsList.get(0));

        for (int i = 1; i < inputAsList.size(); i++) {
            result.append("+");
            result.append(inputAsList.get(i));
        }

        System.out.println(result);
    }
}
