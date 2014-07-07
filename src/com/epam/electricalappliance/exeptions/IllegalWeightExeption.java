package com.epam.electricalappliance.exeptions;

public class IllegalWeightExeption extends Exception{
    public IllegalWeightExeption(int weight) {
        super(String.valueOf(weight));

    }
}
