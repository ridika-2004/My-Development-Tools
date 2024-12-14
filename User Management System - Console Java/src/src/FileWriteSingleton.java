package src;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriteSingleton {
    private static FileWriteSingleton instance;

    private FileWriteSingleton() {}

    public static FileWriteSingleton getInstance() {
        if (instance == null) {
            instance = new FileWriteSingleton();
        }
        return instance;
    }

    public void writeToFile(String filePath, String data, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath, append))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
