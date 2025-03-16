abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return decoratedDevice.getStatus();
    }

    @Override
    public String getName() {
        return decoratedDevice.getName();
    }
}