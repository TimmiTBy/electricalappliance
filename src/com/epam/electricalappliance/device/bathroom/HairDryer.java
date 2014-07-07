package com.epam.electricalappliance.device.bathroom;

import com.epam.electricalappliance.device.Device;
import com.epam.electricalappliance.exeptions.IllegalWindSpeedExeption;
import org.apache.log4j.Logger;

public class HairDryer extends Device {

    public static final Logger LOG = Logger.getLogger(HairDryer.class);

    public static final int MIN_WIND_SPEED_FOR_DRY = 60 ;

    private int windSpeed;

    public HairDryer(int windSpeed) {
        this.windSpeed = windSpeed;
        LOG.info("HairDryer has been created");
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void dry() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof HairDryer))
            return false;

        HairDryer hairdryer = (HairDryer) o;

        if (windSpeed != hairdryer.windSpeed) return false;

        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + windSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "HairDryer with " + getPower() + " power, status " +  isOn() ;
    }
}
