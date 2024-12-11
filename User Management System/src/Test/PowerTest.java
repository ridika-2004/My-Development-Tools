package Test;

import org.junit.jupiter.api.Test;
import src.Power;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerTest {

    @Test
    public void testWriteToFile() throws IOException {
        String testFilePath = "testUser.txt";
        String dataToWrite = "2,PowerUser,power@example.com,234,2";

        Power power = new Power();
        power.writeToFile(testFilePath, dataToWrite);

        boolean dataFound = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(testFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(dataToWrite)) {
                    dataFound = true;
                    break;
                }
            }
        }

        assertTrue(dataFound);
    }
}
