class Light implements SmartDevice {
    private boolean isOn = false;
    private String name;

    public Light(String name) {
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

    @Override
    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF");
    }

    @Override
    public String getName() {
        return name;
    }
}