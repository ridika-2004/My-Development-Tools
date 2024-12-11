import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TopExpenseCategory {

    private final Map<String, Integer> expenseCategories = new HashMap<>();

    public String mostSpentCategory(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int amount = Integer.parseInt(parts[1].trim());
                String category = parts[2].trim();

                if (amount < 0) {
                    expenseCategories.put(category, expenseCategories.getOrDefault(category, 0) + amount);
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filePath, e);
        }

        return expenseCategories.entrySet().stream().min(Map.Entry.comparingByValue()).map(entry -> entry.getKey() + ": " + entry.getValue()).orElse("No expenses found");
    }
}
