import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Choose among these 3 options-");
            System.out.println("1. Economy class   :   $1.75 per mile");
            System.out.println("2. Premium class   :   $3.00 per mile(has additonal 20% subcharges)");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    RideCalculator rideCalculator1 = new RideCalculator();
                    rideCalculator1.economyRideCalculator();
                    break;

                case 2:
                    RideCalculator rideCalculator2 = new RideCalculator();
                    rideCalculator2.premiumRideCalculator();
                    break;

                case 3:
                    System.out.println("Goodbye.......");
                    break;

                default:
                    break;
            }

        }
        while(choice!=3);
        scanner.close();
        
    }
}
