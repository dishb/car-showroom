import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Utilities {
    public static String getStringInput(String prompt, String[] possible, Scanner in) {
        List<String> possibleList = Arrays.asList(possible);
        String userResponse = "";

        System.out.println(prompt + " ");
        userResponse = in.nextLine().toLowerCase();

        while (!possibleList.contains(userResponse)) {
            System.out.println("Invalid input. Please try again.");
            userResponse = in.nextLine().toLowerCase();
        }

        return userResponse;
    }

    public static int getIntInput(String prompt, Integer[] possible, Scanner in) {
        List<Integer> possibleList = Arrays.asList(possible);
        int userResponse = -1;

        System.out.println(prompt + " ");
        userResponse = in.nextInt();

        while (!possibleList.contains(userResponse)) {
            System.out.println("Invalid input. Please try again.");
            userResponse = in.nextInt();
        }

        return userResponse;
    }
}
