package src;

import java.io.*;
import java.util.*;

public class FileUpdateSingleton {
    private static FileUpdateSingleton instance;

    private FileUpdateSingleton() {}

    public static FileUpdateSingleton getInstance() {
        if (instance == null) {
            instance = new FileUpdateSingleton();
        }
        return instance;
    }

    public void updateUserType(int userId, int newUserType, String userFilePath) {
        List<String> fileContent = new ArrayList<>();
        boolean userUpdated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userFields = line.split(",");
                if (userFields.length == 5 && Integer.parseInt(userFields[0]) == userId) {
                    userFields[4] = String.valueOf(newUserType);
                    userUpdated = true;
                }
                fileContent.add(String.join(",", userFields));
            }

            if (userUpdated) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFilePath))) {
                    for (String content : fileContent) {
                        writer.write(content+"\n");
                    }
                    System.out.println("Updated!!");
                }
            } else {
                System.out.println(userId + " not found.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void promoteToAdmin(int userId, String userFilePath, String adminFilePath) {
        List<String> updatedFileContent = new ArrayList<>();
        boolean userPromoted = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userFields = line.split(",");
                if (userFields.length == 5 && Integer.parseInt(userFields[0]) == userId) {
                    if (Integer.parseInt(userFields[4]) != 3) {
                        try (BufferedWriter adminWriter = new BufferedWriter(new FileWriter(adminFilePath, true))) {
                            String adminInfo = userFields[0] + "," + userFields[1] + "," + userFields[2];
                            adminWriter.write(adminInfo+"\n");
                        }
                        userPromoted = true;
                    }
                } else {
                    updatedFileContent.add(line);
                }
            }

            if (userPromoted) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFilePath))) {
                    for (String content : updatedFileContent) {
                        writer.write(content);
                        writer.newLine();
                    }
                    System.out.println("User promoted to Admin and removed from User.csv.");
                }
            } else {
                System.out.println(userId + " not found or already an Admin.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}