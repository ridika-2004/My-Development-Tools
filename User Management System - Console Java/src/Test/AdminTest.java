package Test;

import org.junit.jupiter.api.Test;
import src.Admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminTest {

    @Test
    public void testUpdateUser() throws IOException {
        String userFilePath = "testUser.txt";
        String testEntry = "1,TestUser,test@example.com,123,1";

        List<String> initialData = new ArrayList<>();
        initialData.add(testEntry);

        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(userFilePath))) {
            for (String line : initialData) {
                writer.write(line);
                writer.newLine();
            }
        }

        Admin admin = new Admin();
        admin.updateUser(1, 2, userFilePath);

        boolean updated = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("1") && line.contains(",2")) {
                    updated = true;
                }
            }
        }

        assertTrue(updated);
    }

    @Test
    public void testPromoteUser() throws IOException {
        String userFilePath = "testUser.txt";
        String adminFilePath = "testAdmin.txt";
        String testEntry = "2,TestPower,power@example.com,234,2";

        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(userFilePath))) {
            writer.write(testEntry);
            writer.newLine();
        }

        Admin admin = new Admin();
        admin.promoteUser(2, userFilePath, adminFilePath);

        boolean foundInAdminFile = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(adminFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("2") && line.contains("TestPower") && line.contains("power@example.com")) {
                    foundInAdminFile = true;
                }
            }
        }

        boolean removedFromUserFile = true;
        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("2") && line.contains("TestPower")) {
                    removedFromUserFile = false;
                }
            }
        }

        assertTrue(foundInAdminFile);
        assertTrue(removedFromUserFile);
    }
}
