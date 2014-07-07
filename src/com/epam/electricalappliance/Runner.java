package com.epam.electricalappliance;

import com.epam.electricalappliance.builder.Director;
import com.epam.electricalappliance.device.Device;
import com.epam.electricalappliance.device.bathroom.HairDryer;
import com.epam.electricalappliance.device.kitchen.Fridge;
import com.epam.electricalappliance.device.kitchen.Oven;
import com.epam.electricalappliance.house.SmartHouse;
import com.epam.electricalappliance.utilsfordevices.Sort;
import com.epam.electricalappliance.utilsfordevices.TotalCounter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Iterator;

public class Runner {

    private static final Logger LOG = Logger.getLogger(Runner.class);

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }


    public static void main(String[] args) {

        Fridge fridge = Director.getFridge();
        Oven oven = Director.getOven();
        HairDryer hairDryer = Director.getHairDryer();

        SmartHouse smartHouse = new SmartHouse();
        smartHouse.addDevice(fridge);
        smartHouse.addDevice(oven);
        smartHouse.addDevice(hairDryer);

        smartHouse.findDeviceByPower(100, 160);
        new Sort().sortByPower(smartHouse.getDevicesInHouse());
        new TotalCounter().countTotalCost(smartHouse.getDevicesInHouse());

        smartHouse.iter();


    }
}
