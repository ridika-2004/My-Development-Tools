public class HumiditySensor extends SensoryDevice {
    private String measurementUnit;
    private boolean notificationEnabled;

    public HumiditySensor(String location) {
        super(location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted humidity sensor settings!");
    }

    @Override
    public void notifyUser() {
        System.out.println("Humidity sensor sent you a notification");
    }
}
