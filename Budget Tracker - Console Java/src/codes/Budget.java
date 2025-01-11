package codes;

import utils.AdvancedFileUtils;
import utils.BasicFileUtils;
import utils.BasicUtils;

import java.util.List;

public class Budget {
    public String filename;

    public Budget(String filename){
        this.filename = filename;
    }

    public void setCatagoryandLimit(){
        String numOfCatagories = BasicUtils.takeStringInput("How many catagories you want to add? ");
        int num = Integer.parseInt(numOfCatagories);
        while(num>0){
            String catagory = BasicUtils.takeStringInput("Enter catagory name: ");
            String expenselimit = BasicUtils.takeStringInput("Enter expected limit for this: ");
            int limit = Integer.parseInt(expenselimit);
            BasicFileUtils.write(filename, catagory+","+limit+",0");
            num--;
        }
    }

    public void viewTotalSpending() {
        List<String> lines = BasicFileUtils.read(filename);

        if (lines.isEmpty()) {
            System.out.println("No records yet.");
            return;
        }

        // Print table header
        System.out.println("+----------------+----------------------+----------------+");
        System.out.println("|    Category    | Expected Spending   | Your Spendings |");
        System.out.println("+----------------+----------------------+----------------+");

        // Iterate through the data and print each row
        for (String line : lines) {
            String[] parts = BasicFileUtils.splitIntoParts(line);
            String category = parts[0];
            String expectedLimit = parts[1];
            String actualSpending = parts[2];

            // Print row for each category
            System.out.printf("| %-14s | %-20s | %-14s |\n", category, expectedLimit, actualSpending);
        }

        // Print table footer
        System.out.println("+----------------+----------------------+----------------+");
    }


    public void updateSpending() {
        String category = BasicUtils.takeStringInput("Enter the category you spent on: ");
        String spendingInput = BasicUtils.takeStringInput("Enter the amount you spent: ");

        try {
            int spending = Integer.parseInt(spendingInput);

            List<String> lines = BasicFileUtils.read(filename);
            boolean found = false;

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = BasicFileUtils.splitIntoParts(line);

                if (parts[0].equalsIgnoreCase(category)) { // Match category
                    int currentSpending = Integer.parseInt(parts[2]);
                    int updatedSpending = currentSpending + spending;

                    lines.set(i, parts[0] + "," + parts[1] + "," + updatedSpending);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Category not found.");
                return;
            }

            AdvancedFileUtils.clearFile(filename);
            for (String line : lines) {
                BasicFileUtils.write(filename, line);
            }

            System.out.println("Spending updated successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered. Please enter a valid number.");
        }
    }

    public void consolePieChart() {
        List<String> lines = BasicFileUtils.read(filename);

        if (lines.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }

        int totalSpending = 0;
        int[] spendingValues = new int[lines.size()];
        String[] categories = new String[lines.size()];

        // Calculate total spending and collect data
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = BasicFileUtils.splitIntoParts(lines.get(i));
            categories[i] = parts[0]; // Category name
            spendingValues[i] = Integer.parseInt(parts[2]); // Actual spending
            totalSpending += spendingValues[i];
        }

        // Display pie chart
        System.out.println("\nExpense Chart (Spending Breakdown):");
        for (int i = 0; i < categories.length; i++) {
            int percentage = (int) ((spendingValues[i] / (double) totalSpending) * 100);
            System.out.printf("%-10s: %3d%% ", categories[i], percentage);

            // Create visual bar for pie chart
            for (int j = 0; j < percentage / 2; j++) {
                System.out.print("█");
            }
            System.out.println();
        }

        System.out.println("\nNote: Each '█' represents 2% of the total spending.");
    }


}
