public class Light extends PoweredDevice {
    private int intensity;
    private String color;

    public Light(String location) {
        super(location);
        this.intensity = 400;
        this.color = "Cool White";
    }

    public void setIntensity(int intensity) {
        if (intensity == 400 || intensity == 150) {
            this.intensity = intensity;
            System.out.println("Light intensity set to: " + intensity + " lux");
        } else {
            System.out.println("Invalid intensity");
        }
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("Cool White") || color.equalsIgnoreCase("Amber")) {
            this.color = color;
            System.out.println("Color set to: " + color);
        } else {
            System.out.println("Invalid color");
        }
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting light settings - Intensity: " + intensity + " lux, Color: " + color);
    }
}
