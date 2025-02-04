public class MotorVehicle extends Vehicle{

    public void startEngine(){
        System.out.println("Start engine");
    }
    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void stop() {
        System.out.println("Pulled out the key!");
    }
}
