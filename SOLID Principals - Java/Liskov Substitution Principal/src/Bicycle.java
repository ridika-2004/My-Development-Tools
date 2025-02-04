public class Bicycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Cycling");
    }

    @Override
    public void stop() {
        System.out.println("Hit the breaks!");
    }
}
