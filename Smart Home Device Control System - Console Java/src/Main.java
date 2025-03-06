public class Main {
    public static void main(String[] args) {
        DeviceManager manager = new DeviceManager();

        SmartDevice airConditioner = new AirConditioner("Living Room");
        airConditioner.turnOn();
        airConditioner.adjustSettings();
        SmartDevice light = new Light("Living Room");
        light.turnOn();
        light.adjustSettings();

        SmartDevice humiditySensor = new HumiditySensor("Kitchen", "%");
        humiditySensor.adjustSettings();
        humiditySensor.turnOff();
        SmartDevice smokeDetector = new SmokeDetector("Kitchen");
        smokeDetector.turnOn();
        smokeDetector.adjustSettings();

        SmartDevice securityAlarm = new SecurityAlarm("Doorway", "123");
        securityAlarm.adjustSettings();
        SmartDevice securityCamera = new SecurityCamera("Doorway");
        securityCamera.turnOn();

        manager.addDevice(airConditioner);
        manager.addDevice(light);
        manager.addDevice(humiditySensor);
        manager.addDevice(smokeDetector);
        manager.addDevice(securityAlarm);
        manager.addDevice(securityCamera);

        manager.removeDevice(airConditioner);

    }
}
