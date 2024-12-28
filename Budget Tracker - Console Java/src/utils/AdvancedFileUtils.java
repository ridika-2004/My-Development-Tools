package utils;

import java.io.*;

public class AdvancedFileUtils {

    public static boolean deleteLine(String fileName, String searchTerm) {
        String lineToDelete = BasicFileUtils.search(fileName, searchTerm);
        if (lineToDelete == null) {
            return false;
        }
        File inputFile = new File(fileName);
        File tempFile = new File("temp_" + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(lineToDelete)) {
                    writer.write(line+"\n");
                }
            }

            if (fileRename(tempFile, inputFile)) {
                return true;
            }

        } catch (IOException e) {
            System.err.println("Error deleting line from file: " + e.getMessage());
        }
        tempFile.delete();
        return false;
    }

    public static void clearFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        } catch (IOException e) {
            System.err.println("Error clearing the file: " + e.getMessage());
        }
    }

    public static boolean fileRename(File sourceFile, File destFile) {
        if (destFile.exists()) {
            destFile.delete();
        }
        return sourceFile.renameTo(destFile);
    }
}