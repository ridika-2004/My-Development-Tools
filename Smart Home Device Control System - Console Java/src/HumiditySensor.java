public class HumiditySensor extends SensoryDevice {
    private String measurementUnit;

    public HumiditySensor(String location, String measurementUnit) {
        super(location);
        this.measurementUnit = measurementUnit;
    }

    public void setMeasurementUnit(String unit) {
        this.measurementUnit = unit;
        System.out.println("Humidity measurement unit set to: " + unit);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted humidity sensor settings!");
    }

    @Override
    public void notifyUser() {
        if (notificationEnabled) {
            System.out.println("This is a humidity sensor notification.");
        }
    }
}