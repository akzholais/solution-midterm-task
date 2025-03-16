import java.util.HashMap;
import java.util.Map;

class SmartHomeController {
    private Map<String, SmartDevice> devices = new HashMap<>();

    public void addDevice(SmartDevice device) {
        devices.put(device.getName().toLowerCase(), device);
    }

    public void turnDeviceOn(String name) {
        SmartDevice device = devices.get(name.toLowerCase());
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("No device found with name: " + name);
        }
    }

    public void turnDeviceOff(String name) {
        SmartDevice device = devices.get(name.toLowerCase());
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("No device found with name: " + name);
        }
    }

    public void showDeviceStatus(String name) {
        SmartDevice device = devices.get(name.toLowerCase());
        if (device != null) {
            System.out.println(device.getStatus());
        } else {
            System.out.println("No device found with name: " + name);
        }
    }

    public void turnAllDevicesOn() {
        for (SmartDevice device : devices.values()) {
            device.turnOn();
        }
    }

    public void turnAllDevicesOff() {
        for (SmartDevice device : devices.values()) {
            device.turnOff();
        }
    }

    public void showAllDevicesStatus() {
        for (SmartDevice device : devices.values()) {
            System.out.println(device.getStatus());
        }
    }
}