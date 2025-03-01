public class SmokeDetector extends SensoryDevice {
    private boolean sprinkleActivated;
    private boolean notificationEnabled;

    public SmokeDetector(String location) {
        super(location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted smoke detector settings!");
    }

    @Override
    public void notifyUser() {
        System.out.println("Smoke detector sent you a notification");
    }
}
