import java.util.Scanner;

public class RideCalculator {
    private static double baseFair = 5.00;
    private static Scanner scanner = new Scanner(System.in);

    public void economyRideCalculator(){
        double mile,time,estimatedTime;
        System.out.print("Estimated Mile: ");
        mile = scanner.nextDouble();
        System.out.print("Estimated time: ");
        estimatedTime = scanner.nextDouble();
        System.out.print("Time needed to reach destination: ");
        time = scanner.nextDouble();
        double total = mile*1.75 + time*0.5 + baseFair;
        if(time<=estimatedTime-10.00){
            total = total-(total*0.01);
        }
        System.out.println("Total fee is :"+total);
        System.out.println("Thank you for choosing our ride");
        
    }

    public void premiumRideCalculator(){
        double mile,time,estimatedTime;
        System.out.print("Estimated Mile: ");
        mile = scanner.nextDouble();
        System.out.print("Estimated time: ");
        estimatedTime = scanner.nextDouble();
        System.out.print("Time needed to reach destination: ");
        time = scanner.nextDouble();
        double total = mile*3.0 + time*0.5 + baseFair;
        double fair = total+(total*0.2);
        if(time<=estimatedTime-10.00){
            fair = total-(total*0.01);
        }
        System.out.println("Total fee is :"+fair);
        System.out.println("Thank you for choosing our ride");
    }
}
