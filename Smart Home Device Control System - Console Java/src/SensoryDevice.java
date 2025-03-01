public abstract class SensoryDevice extends SmartDevice {
    public SensoryDevice(String location) {
        super(location);
    }

    public abstract void notifyUser();
}
