import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankTransactions {

    public int countTransactionsForMonth(String filePath, String monthYear) throws IOException {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                LocalDate date = LocalDate.parse(parts[0].trim(), formatter);

                String formattedMonthYear = date.getMonthValue() + "-" + date.getYear();

                if (formattedMonthYear.equals(monthYear)) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filePath, e);
        }

        return count;
    }
}
