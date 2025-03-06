public class SecurityAlarm extends SecurityDevice {
    private String password;
    private boolean notifyOnEntry;
    private boolean notifyOnFailure;

    public SecurityAlarm(String location, String password) {
        super(location);
        this.password = password;
        this.notifyOnEntry = true;
        this.notifyOnFailure = true;
    }

    public boolean verifyPassword(String inputPassword) {
        if (inputPassword.equals(this.password)) {
            if (notifyOnEntry) {
                notifyUser();
            }
            System.out.println("Access granted.");
            return true;
        } else {
            if (notifyOnFailure) {
                notifyUser();
            }
            System.out.println("Access denied.");
            return false;
        }
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
