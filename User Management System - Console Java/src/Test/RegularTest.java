package Test;

import org.junit.jupiter.api.Test;
import src.Regular;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularTest {

    @Test
    public void testReadFromFile() throws IOException {
        String testFilePath = "testUser.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFilePath))) {
            writer.write("1,RegularUser,regular@example.com,123,1");
            writer.newLine();
        }

        Regular regular = new Regular();
        regular.readFromFile(testFilePath);

        assertEquals(1, regular.getUserType());
    }
}
