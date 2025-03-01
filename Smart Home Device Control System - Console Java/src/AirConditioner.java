public class AirConditioner extends PoweredDevice {
    private String fanSpeed;
    private int temperature;

    public AirConditioner(String location) {
        super(location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted air conditioner settings!");
    }
}
