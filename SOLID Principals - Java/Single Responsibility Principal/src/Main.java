public class Main {
    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(100.00);
        Car car = new Car(fuelTank);

        car.drive(10);
    }
}