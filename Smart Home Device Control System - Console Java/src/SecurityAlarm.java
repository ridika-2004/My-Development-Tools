public class SecurityAlarm extends SecurityDevice {
    private String password;

    public SecurityAlarm(String location) {
        super(location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusted security alarm settings!");
    }

    @Override
    public void notifyUser() {
        System.out.println("Security alarm sent you a notification");
    }
}
