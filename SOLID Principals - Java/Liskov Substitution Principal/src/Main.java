public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        bicycle.drive();
        Vehicle truck = new MotorVehicle();
        truck.stop();
    }
}