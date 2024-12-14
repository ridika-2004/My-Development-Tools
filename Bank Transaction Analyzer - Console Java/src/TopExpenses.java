import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TopExpenses {

    private final Map<String, Integer> expenseCategories = new HashMap<>();

    public List<Map.Entry<String, Integer>> top10Expenses(String filePath) throws IOException {
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

        List<Map.Entry<String, Integer>> sortedExpenses = new ArrayList<>(expenseCategories.entrySet());
        sortedExpenses.sort((entry1, entry2) -> Integer.compare(entry1.getValue(), entry2.getValue()));

        return sortedExpenses.subList(0, Math.min(10, sortedExpenses.size()));
    }
}
