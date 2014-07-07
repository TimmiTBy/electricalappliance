package com.epam.electricalappliance.device.kitchen;
import com.epam.electricalappliance.device.Device;
import com.epam.electricalappliance.exeptions.IllegalFreezTemperatureExeption;
import org.apache.log4j.Logger;

public class Fridge  extends Device {

    public static final Logger LOG = Logger.getLogger(Fridge.class);

    public static final int MIN_FROZEN_TEMPERATURE = -1;

    private int temperature;

    public Fridge(int temperature) {
       this.temperature = temperature;
       LOG.info("Fridge has been created");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void freezFood() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fridge)) return false;

        Fridge fridge = (Fridge) o;

        if (temperature != fridge.temperature) return false;

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
        return "Fridge with " + getPower() + " power, status " +  isOn() ;
    }
}
