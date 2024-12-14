public class FacultyFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.50; // $0.50 per day
    }
}