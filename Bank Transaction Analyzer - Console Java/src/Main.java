import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CalculateProfitLoss calculator = new CalculateProfitLoss();
        BankTransactions transactions = new BankTransactions();
        TopExpenses topExpenses = new TopExpenses();
        TopExpenseCategory topCategory = new TopExpenseCategory();

        try {
            int result = calculator.calculate("data.txt");
            System.out.println("Total Profit or Loss: " + result);
            System.out.println(result > 0 ? "Profit" : "Loss");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try {
            int count = transactions.countTransactionsForMonth("data.txt", "2-2017");
            System.out.println("Number of transactions in February 2017: " + count);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try {
            List<Map.Entry<String, Integer>> top10 = topExpenses.top10Expenses("data.txt");
            System.out.println("Top 10 Expense Categories:");
            for (Map.Entry<String, Integer> entry : top10) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try {
            String result = topCategory.mostSpentCategory("data.txt");
            System.out.println("Most Spent Category:");
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

