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

    public void viewTotalSpending(){
        List<String> lines = BasicFileUtils.read(filename);
        if(lines.size()==0){
            System.out.println("No records yet");
            return;
        }
        for(String line : lines){
            String[] parts = BasicFileUtils.splitIntoParts(line);
            System.out.println("Catagpry : "+parts[0]+" --- Expected spending limit : "+parts[1]+" --- Your spendings : "+parts[2]);
        }
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

                    // Update the line
                    lines.set(i, parts[0] + "," + parts[1] + "," + updatedSpending);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Category not found.");
                return;
            }

            // Rewrite the file with updated lines
            AdvancedFileUtils.clearFile(filename);
            for (String line : lines) {
                BasicFileUtils.write(filename, line);
            }

            System.out.println("Spending updated successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered. Please enter a valid number.");
        }
    }

}
