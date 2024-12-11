package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Regular extends User {

    public Regular() {
        setUserType(1);
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
