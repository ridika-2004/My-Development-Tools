public class Light extends PoweredDevice {
    private int intensity;
    private String color;

    public Light(String location) {
        super(location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted light settings!");
    }
}
