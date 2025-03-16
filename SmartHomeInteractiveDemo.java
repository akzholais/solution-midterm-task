import java.util.Scanner;

public class SmartHomeInteractiveDemo {
    public static void main(String[] args) {
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        SmartDevice light1 = basicFactory.createLight("BasicLight");
        SmartDevice light2 = advancedFactory.createLight("AdvancedLight");
        SmartDevice thermostat1 = basicFactory.createThermostat("BasicThermostat");
        SmartDevice thermostat2 = advancedFactory.createThermostat("AdvancedThermostat");
        SmartDevice camera1 = basicFactory.createSecurityCamera("SecurityCamera");

        DeviceGroup livingRoom = new DeviceGroup("LivingRoom");
        livingRoom.addDevice(light1);
        livingRoom.addDevice(light2);
        livingRoom.addDevice(thermostat1);
        livingRoom.addDevice(thermostat2);
        livingRoom.addDevice(camera1);

        LegacyDoorLockSystem legacyLock = new LegacyDoorLockSystem();
        SmartDevice doorLock = new DoorLockAdapter("DoorLock", legacyLock);

        SmartHomeController controller = new SmartHomeController();

        controller.addDevice(livingRoom);
        controller.addDevice(light1);
        controller.addDevice(light2);
        controller.addDevice(thermostat1);
        controller.addDevice(thermostat2);
        controller.addDevice(camera1);
        controller.addDevice(doorLock);

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Smart Home Selective Control ===");
        System.out.println("Teams:");
        System.out.println("  on <name>      - enable device/group");
        System.out.println("  off <name>      - turn off device/group");
        System.out.println("  status <name>   - show device/group status");
        System.out.println("  on all         - turn on all devices");
        System.out.println("  off all        - turn off all devices");
        System.out.println("  status all     - status of all devices");
        System.out.println("  exit           - exit");

        while (true) {
            System.out.print("\nEnter the command: ");
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Shutting down the system.");
                break;
            }

            String[] parts = line.split("\\s+");
            if (parts.length == 1) {
                System.out.println("Invalid command or device name not specified.");
                continue;
            }

            String action = parts[0].toLowerCase();
            String target = parts[1];

            switch (action) {
                case "on":
                    if (target.equalsIgnoreCase("all")) {
                        controller.turnAllDevicesOn();
                    } else {
                        controller.turnDeviceOn(target);
                    }
                    break;

                case "off":
                    if (target.equalsIgnoreCase("all")) {
                        controller.turnAllDevicesOff();
                    } else {
                        controller.turnDeviceOff(target);
                    }
                    break;

                case "status":
                    if (target.equalsIgnoreCase("all")) {
                        controller.showAllDevicesStatus();
                    } else {
                        controller.showDeviceStatus(target);
                    }
                    break;

                default:
                    System.out.println("Unknown command: " + action);
                    break;
            }
        }
        scanner.close();
    }
}