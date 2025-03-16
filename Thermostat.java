class Thermostat implements SmartDevice {
    private boolean isOn = false;
    private int temperature = 20;
    private String name;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " temperature set to " + temperature + "°C.");
    }

    @Override
    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF") + " at " + temperature + "°C";
    }

    @Override
    public String getName() {
        return name;
    }
}