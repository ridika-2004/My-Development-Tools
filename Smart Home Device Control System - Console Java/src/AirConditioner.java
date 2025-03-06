public class AirConditioner extends PoweredDevice {
    private int temperature;
    private String fanSpeed;

    public AirConditioner(String location) {
        super(location);
        this.temperature = 22;
        this.fanSpeed = "Low";
    }

    public void setTemperature(int temp) {
        if (temp >= 18 && temp <= 25) {
            this.temperature = temp;
            System.out.println("Temperature set to: " + temp + "°C");
        } else {
            System.out.println("Invalid temperature. Must be between 18-25°C");
        }
    }

    public void setFanSpeed(String speed) {
        if (speed.equalsIgnoreCase("High") || speed.equalsIgnoreCase("Low")) {
            this.fanSpeed = speed;
            System.out.println("Fan speed set to: " + speed);
        } else {
            System.out.println("Invalid fan speed");
        }
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting AC settings - Temperature: " + temperature + "°C, Fan Speed: " + fanSpeed);
    }
}
