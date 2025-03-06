public abstract class SensoryDevice extends SmartDevice {
    protected boolean notificationEnabled;

    public SensoryDevice(String location) {
        super(location);
    }

    public abstract void notifyUser();
    public abstract void adjustSettings();

    public void toggleNotification(boolean enable) {
        this.notificationEnabled = enable;
        System.out.println("User notifications " + (enable ? "enabled" : "disabled"));
    }
}