package utils;

import java.util.Scanner;

public class BasicUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String takeStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean confirmAction(String message) {
        System.out.print(message + " (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes");
    }

    public static boolean isValidInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input. Please try again.");
            return false;
        }
        return true;
    }
}
