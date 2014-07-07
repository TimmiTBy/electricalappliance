package com.epam.electricalappliance.exeptions;

public class IllegalBakeTempeatureExeption extends Exception {

    public IllegalBakeTempeatureExeption(int temperature) {
        super(String.valueOf(temperature));
    }
}
