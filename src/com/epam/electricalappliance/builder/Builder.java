package com.epam.electricalappliance.builder;

import com.epam.electricalappliance.device.Device;

public abstract class Builder {

    public void buildPower() {

    }

    public void buildCost() {

    }

    public void buildWeight() {

    }

    public void buildIsOn() {

    }

    abstract Object getDevice();
}
