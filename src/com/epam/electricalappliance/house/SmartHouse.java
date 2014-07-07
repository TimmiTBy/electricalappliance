package com.epam.electricalappliance.house;

import com.epam.electricalappliance.device.Device;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Iterator;

public class SmartHouse{

    public static final Logger LOG = Logger.getLogger(SmartHouse.class);

    private ArrayList<Device> devicesInHouse;

    public SmartHouse() {
        devicesInHouse = new ArrayList<>();
    }

    public Iterator<Device> iter() {
        return devicesInHouse.iterator();
    }
    public ArrayList<Device> getDevicesInHouse() {
        return devicesInHouse;
    }

    public void addDevice(Device device) {
        devicesInHouse.add(device);
        LOG.info(device + "Has been added to SmartHouse");
    }

    public Device findDeviceByPower(int minPower, int maxPower) {
        for (Device device : devicesInHouse) {
            if (device.getPower() > minPower && device.getPower() < maxPower) {
                return device;
            }
        }
        return null;
    }

}
