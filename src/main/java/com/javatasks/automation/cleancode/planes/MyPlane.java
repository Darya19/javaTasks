package com.javatasks.automation.cleancode.planes;

import org.apache.commons.lang3.NotImplementedException;

public class MyPlane extends Plane {

    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        throw new NotImplementedException("Not implemented");
    }

    //TODO implement it later
}
