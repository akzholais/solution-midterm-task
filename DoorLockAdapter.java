class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLockSystem legacySystem;
    private String name;

    public DoorLockAdapter(String name, LegacyDoorLockSystem legacySystem) {
        this.name = name;
        this.legacySystem = legacySystem;
    }

    @Override
    public void turnOn() {
        legacySystem.unlock();
    }

    @Override
    public void turnOff() {
        legacySystem.lock();
    }

    @Override
    public String getStatus() {
        return name + ": " + legacySystem.doorStatus();
    }

    @Override
    public String getName() {
        return name;
    }
}