public class Car {
    private FuelTank fuelTank;

    public Car(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void drive(double distance){
        if(this.fuelTank.hasEnoughFuel(distance)){
            this.fuelTank.consumeFuelLevel(distance);
            System.out.printf("Driving %.2f miles. Fuel level : %.2f",distance,this.fuelTank.getFuelLevel());
        } else {
            System.out.println("Not enough fuel");
        }
    }
}
