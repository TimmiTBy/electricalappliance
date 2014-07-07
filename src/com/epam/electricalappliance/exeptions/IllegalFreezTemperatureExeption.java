package com.epam.electricalappliance.exeptions;

public class IllegalFreezTemperatureExeption extends Exception{

    public IllegalFreezTemperatureExeption(int temperature) {
        super(String.valueOf(temperature));

    }
}
