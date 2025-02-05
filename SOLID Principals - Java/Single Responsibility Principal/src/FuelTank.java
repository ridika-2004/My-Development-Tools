public class FuelTank {
    private double fuelLevel;

    public FuelTank(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean hasEnoughFuel(double distance){
        return this.fuelLevel>=distance;
    }

    public void consumeFuelLevel(double distance){
        this.fuelLevel-=distance;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }
}
