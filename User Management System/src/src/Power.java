package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Power extends User {

    public Power() {
        setUserType(2);
    }

    public void writeToFile(String filePath, String data) {
        FileWriteSingleton fileWriter = FileWriteSingleton.getInstance();
        fileWriter.writeToFile(filePath, data, true);
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
