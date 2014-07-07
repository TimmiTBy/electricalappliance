package com.epam.electricalappliance.utilsfordevices;

import com.epam.electricalappliance.device.Device;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class TotalCounter {

    public static final Logger LOG = Logger.getLogger(TotalCounter.class);

    public int countTotalPower(ArrayList<Device> list) {
        int totalPower = 0;
        for (Device device : list) {
            totalPower = totalPower + device.getPower();
        }
        LOG.info("Total power: " + totalPower);
        return totalPower;
    }

    public int countTotalCost(ArrayList<Device> list) {
        int totalCost = 0;
        for (Device device : list) {
            totalCost = totalCost + device.getCost();
        }
        LOG.info("Total cost: " + totalCost);
        return totalCost;
    }
}
