package com.epam.electricalappliance.exeptions;

public class IllegalWindSpeedExeption extends Exception{
    public IllegalWindSpeedExeption(int windSpeed) {
        super(String.valueOf(windSpeed));
    }
}
