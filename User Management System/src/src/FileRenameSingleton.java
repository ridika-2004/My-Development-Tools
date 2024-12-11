package src;

import java.io.File;

public class FileRenameSingleton {
    private static FileRenameSingleton instance;

    private FileRenameSingleton() {}

    public static FileRenameSingleton getInstance() {
        if (instance == null) {
            instance = new FileRenameSingleton();
        }
        return instance;
    }

    public boolean renameFile(String oldFilePath, String newFilePath) {
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);
        if (newFile.exists()) {
            System.out.println("Error: A file with the new name already exists.");
            return false;
        }
        return oldFile.renameTo(newFile);
    }
}
