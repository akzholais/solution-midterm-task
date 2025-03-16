class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Logging: turning on " + getName());
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logging: turning off " + getName());
        super.turnOff();
    }

    @Override
    public String getStatus() {
        System.out.println("Logging: retrieving status for " + getName());
        return super.getStatus();
    }
}