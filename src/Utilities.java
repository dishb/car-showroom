import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Utilities {
    public static String getStringInput(String prompt, String[] possible, Scanner in) {
        List<String> possibleList = Arrays.asList(possible);
        String userResponse = "";

        System.out.println("\n" + prompt + "\n");
        userResponse = in.nextLine().toLowerCase();

        if (userResponse.equals("quit")) {
            System.exit(0);
        }

        if (possibleList.size() > 0) {
            while (!possibleList.contains(userResponse)) {
                System.out.println("\nInvalid input. Please try again.\n");
                userResponse = in.nextLine().toLowerCase();
            }
        }

        return userResponse;
    }

    public static int getIntInput(String prompt, Integer[] possible, Scanner in) {
        List<Integer> possibleList = Arrays.asList(possible);
        int userResponse = -1;

        System.out.println("\n" + prompt + "\n");
        userResponse = in.nextInt();
        in.nextLine();

        if (possibleList.size() > 0) {
            while (!possibleList.contains(userResponse)) {
                System.out.println("\nInvalid input. Please try again.\n");
                userResponse = in.nextInt();
                in.nextLine();
            }
        }

        return userResponse;
    }
}
