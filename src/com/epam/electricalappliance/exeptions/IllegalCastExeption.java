package com.epam.electricalappliance.exeptions;

/**
 * Created by Klikun_AU on 18.06.2014.
 */
public class IllegalCastExeption extends Exception{
    public IllegalCastExeption(int cast) {
        super(String.valueOf(cast));

    }
}
