package com.epam.electricalappliance.builder;

import com.epam.electricalappliance.device.bathroom.HairDryer;
import com.epam.electricalappliance.device.kitchen.Fridge;
import com.epam.electricalappliance.device.kitchen.Oven;

public class Director {

    public static Fridge getFridge() {
        FridgeBuilder fridgeBuilder = new FridgeBuilder();
        return fridgeBuilder.getDevice();
    }

    public static Oven getOven() {
       OvenBuilder ovenBuilder = new OvenBuilder();
        return ovenBuilder.getDevice();
    }

    public static HairDryer getHairDryer() {
        HairDryerBuilder hairDryerBuilder = new HairDryerBuilder();
        return hairDryerBuilder.getDevice();
    }
}
