public class StudentFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0; // $1 per day
    }
}