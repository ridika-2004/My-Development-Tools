public class SecurityCamera extends SecurityDevice {
    private boolean autoSaveEnabled;

    public SecurityCamera(String location) {
        super(location);
        this.autoSaveEnabled = false;
    }

    public void setAutoSaveEnabled(boolean enabled) {
        this.autoSaveEnabled = enabled;
        System.out.println("Auto-save " + (enabled ? "enabled" : "disabled"));
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted security camera settings!");
    }

    @Override
    public void notifyUser() {
        System.out.println("Security camera sent you a notification");
    }
}
