package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BasicFileUtils {

    public static String search(String fileName, String searchTerm) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = splitIntoParts(line);
                for (String part : parts) {
                    if (part.trim().equals(searchTerm)) {
                        return line;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file.");
        }
        return null;
    }

    public static List<String> read(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file.");
        }
        return lines;
    }

    public static String[] splitIntoParts(String line) {
        return line.split(",");
    }

    public static void write(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.err.println("Error appending to file.");
        }
    }
}

