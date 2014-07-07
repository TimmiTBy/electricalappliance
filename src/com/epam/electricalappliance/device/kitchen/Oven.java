package com.epam.electricalappliance.device.kitchen;

import com.epam.electricalappliance.device.Device;
import com.epam.electricalappliance.exeptions.IllegalBakeTempeatureExeption;
import org.apache.log4j.Logger;

public class Oven  extends Device {

    public static final Logger LOG = Logger.getLogger(Oven.class);

    public static final int MIN_BAKE_TEMPERATURE = 50;

    private int temperature;

    public Oven(int temperature) {
       this.temperature = temperature;
       LOG.info("Oven has been created");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void bake() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;

        Oven oven = (Oven) o;

        if (temperature != oven.temperature) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + temperature;
        return result;
    }

    @Override
    public String toString() {
        return "Oven with " + getPower() + " power, status " +  isOn() ;
    }
}
