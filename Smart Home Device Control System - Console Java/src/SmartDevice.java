public abstract class SmartDevice {
    protected String location;
    protected boolean isOn;

    public SmartDevice(String location) {
        this.location = location;
        this.isOn = false;
    }

    public void turnOn() {
        System.out.println("Toggling on.");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Toggling off.");
        isOn = false;
    }

    public abstract void adjustSettings();
}
