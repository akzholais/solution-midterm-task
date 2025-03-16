class ScheduledOperationDecorator extends DeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduling turn ON for " + getName());
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Scheduling turn OFF for " + getName());
        super.turnOff();
    }
}