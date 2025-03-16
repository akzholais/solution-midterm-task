# Smart Home Control System

This project is a simple smart home system. It shows how to control home devices like lights, thermostats, and cameras. I use some design patterns to make the code clear and easy to change.

## Overview

The system can turn devices on and off. You can control one device or a group of devices using a simple command line interface (CLI).

### Patterns Used

1. **Composite Pattern**  
   - **What it does:** It groups devices into rooms.  
   - **How it works:** When you turn on a room, all devices in that room turn on.

2. **Decorator Pattern**  
   - **What it does:** It adds extra features to devices.  
   - **Example:** You can add logging or scheduling to a light.

3. **Abstract Factory Pattern**  
   - **What it does:** It creates families of devices.  
   - **How it works:** One factory makes basic devices, and another makes advanced devices with extra features.

4. **Facade Pattern**  
   - **What it does:** It gives one simple way to control all devices.  
   - **How it works:** The SmartHomeController class controls many devices at once.

5. **Adapter Pattern**  
   - **What it does:** It makes an old door lock system work with the smart home system.  
   - **How it works:** The DoorLockAdapter lets the old door lock act like a normal device.

## How the System Works

- The **SmartDevice** interface defines methods to turn a device on, turn it off, and check its status.
- Factories create devices. You can choose basic or advanced devices.
- Devices can be put into groups (like a room). When you control the group, all devices in that group respond.
- The **SmartHomeController** is the main class to control devices.
- A legacy door lock system is adapted to work with the system.




