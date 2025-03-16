import java.util.ArrayList;
import java.util.List;

class DeviceGroup implements SmartDevice {
    private List<SmartDevice> devices = new ArrayList<>();
    private String groupName;

    public DeviceGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on group: " + groupName);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off group: " + groupName);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder("Status for group " + groupName + ":\n");
        for (SmartDevice device : devices) {
            sb.append(" - ").append(device.getStatus()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String getName() {
        return groupName;
    }
}