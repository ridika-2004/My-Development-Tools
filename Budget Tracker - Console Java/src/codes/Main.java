package codes;

public class Main {
    public static void main(String[] args) {
        String budgetFile = "src/files/Budget.txt";
        Budget budget = new Budget(budgetFile);
        //budget.setCatagoryandLimit();
        budget.viewTotalSpending();
        //budget.updateSpending();
        budget.consolePieChart();
    }
}
