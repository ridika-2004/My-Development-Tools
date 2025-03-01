public class Main {
    public static void main(String[] args) {
        DeviceManager manager = new DeviceManager();

        PoweredDevice light = new Light("Living Room");
        PoweredDevice ac = new AirConditioner("Bedroom");
        SecurityDevice alarm = new SecurityAlarm("Main Door");
        SecurityDevice camera = new SecurityCamera("Backyard");
        SensoryDevice smokeDetector = new SmokeDetector("Kitchen");
        SensoryDevice humiditySensor = new HumiditySensor("Bathroom");

        manager.addDevice(light);
        manager.addDevice(ac);
        manager.addDevice(alarm);
        manager.addDevice(camera);
        manager.addDevice(smokeDetector);
        manager.addDevice(humiditySensor);

        light.turnOn();
        ac.turnOn();
        alarm.turnOff();
        camera.turnOn();
        smokeDetector.turnOff();
        humiditySensor.turnOn();

        light.adjustSettings();
        ac.adjustSettings();
        alarm.adjustSettings();
        camera.adjustSettings();
        smokeDetector.adjustSettings();
        humiditySensor.adjustSettings();

        alarm.notifyUser();
        camera.notifyUser();
        smokeDetector.notifyUser();
        humiditySensor.notifyUser();

        manager.removeDevice(ac);
    }
}
