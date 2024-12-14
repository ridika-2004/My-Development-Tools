package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Admin extends User {

    public Admin() {
        setUserType(3);
    }

    public void writeToFile(String filePath, String data) {
        FileWriteSingleton fileWriter = FileWriteSingleton.getInstance();
        fileWriter.writeToFile(filePath, data, true);
    }

    public void renameFile(String oldFilePath, String newFilePath) {
        FileRenameSingleton fileRenamer = FileRenameSingleton.getInstance();
        fileRenamer.renameFile(oldFilePath, newFilePath);
    }

    public void updateUser(int userId, int newUserType, String filePath) {
        FileUpdateSingleton fileUpdateSingleton = FileUpdateSingleton.getInstance();
        fileUpdateSingleton.updateUserType(userId, newUserType, filePath);
    }

    public void promoteUser(int userId, String userFilePath, String adminFilePath)
    {
        FileUpdateSingleton fileUpdateSingleton = FileUpdateSingleton.getInstance();
        fileUpdateSingleton.promoteToAdmin(userId,userFilePath,adminFilePath);
    }

    @Override
    public void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
