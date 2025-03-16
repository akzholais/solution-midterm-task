class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        SmartDevice light = new Light(name);

        light = new LoggingDecorator(light);
        light = new ScheduledOperationDecorator(light);
        return light;
    }

    @Override
    public SmartDevice createThermostat(String name) {
        SmartDevice thermostat = new Thermostat(name);
        thermostat = new LoggingDecorator(thermostat);
        return thermostat;
    }

    @Override
    public SmartDevice createSecurityCamera(String name) {
        SmartDevice camera = new SecurityCamera(name);
        camera = new LoggingDecorator(camera);
        return camera;
    }
}