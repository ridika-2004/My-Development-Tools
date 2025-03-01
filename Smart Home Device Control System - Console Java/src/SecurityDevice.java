public abstract class SecurityDevice extends SmartDevice {
    public SecurityDevice(String location) {
        super(location);
    }

    public abstract void notifyUser();
}
