import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculateProfitLoss {

    public int calculate(String filePath) throws IOException {
        int totalAmount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int amount = Integer.parseInt(parts[1].trim());
                totalAmount += amount;
            }
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filePath, e);
        }

        return totalAmount;
    }
}