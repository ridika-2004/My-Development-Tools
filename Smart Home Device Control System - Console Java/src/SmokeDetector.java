public class SmokeDetector extends SensoryDevice {
    private boolean sprinkleActivated;

    public SmokeDetector(String location) {
        super(location);
    }

    public void toggleSprinkle(boolean activate) {
        this.sprinkleActivated = activate;
        System.out.println("Sprinkle system " + (activate ? "activated" : "deactivated"));
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted smoke detector settings!");
    }

    @Override
    public void notifyUser() {
        if (notificationEnabled) {
            System.out.println("This is a smoke detector notification.");
        }
    }
}
