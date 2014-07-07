package com.epam.electricalappliance.utilsfordevices;

import com.epam.electricalappliance.comparator.DeviceComparatorByPower;
import com.epam.electricalappliance.device.Device;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    public static final Logger LOG = Logger.getLogger(Sort.class);

    public void sortByPower(ArrayList<Device> list) {
        Collections.sort(list, new DeviceComparatorByPower());
        LOG.info("Your devices had beed sorted by power");
    }

    public void sortByCost(ArrayList<Device> list) {
        Collections.sort(list, new DeviceComparatorByPower());
        LOG.info("Your devices had beed sorted by cost");
    }

}
