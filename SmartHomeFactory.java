interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
    SmartDevice createSecurityCamera(String name);
}