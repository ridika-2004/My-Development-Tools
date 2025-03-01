public class SecurityCamera extends SecurityDevice {
    private boolean autoSaveEnabled;

    public SecurityCamera(String location) {
        super(location);
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
