package com.epam.electricalappliance.exeptions;

public class IllegalPowerExeption extends Exception{
    public IllegalPowerExeption(int power) {
        super(String.valueOf(power));

    }
}
