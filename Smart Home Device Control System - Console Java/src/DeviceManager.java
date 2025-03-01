import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private List<SmartDevice> devices;

    public DeviceManager() {
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Added "+ device.getClass());
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
        System.out.println("Removed "+ device.getClass());
    }
}
