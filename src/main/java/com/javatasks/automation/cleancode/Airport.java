package com.javatasks.automation.cleancode;

import com.javatasks.automation.cleancode.planes.ExperimentalPlane;
import com.javatasks.automation.cleancode.planes.MilitaryPlane;
import com.javatasks.automation.cleancode.planes.PassengerPlane;
import com.javatasks.automation.cleancode.planes.Plane;
import com.javatasks.automation.cleancode.models.MilitaryType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vitali Shulha
 * @version 1.1
 * @since 4-Jan-2019
 */

public class Airport {

    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : getPlanes()) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : getPlanes()) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : getPlanes()) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        return getMilitaryPlanesByType(MilitaryType.TRANSPORT);
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return getMilitaryPlanesByType(MilitaryType.BOMBER);
    }

    private List<MilitaryPlane> getMilitaryPlanesByType(MilitaryType type) {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane militaryPlane : getMilitaryPlanes()) {
            if (militaryPlane.getType().equals(type)) {
                bomberMilitaryPlanes.add(militaryPlane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return getPassengerPlanes().stream().max(Comparator.comparingInt(PassengerPlane::getPassengersCapacity)).get();
    }

    public Airport sortByMaxDistance() {
        getPlanes().sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
        return this;
    }

    public Airport sortByMaxSpeed() {
        getPlanes().sort((Comparator.comparingInt(Plane::getMaxSpeed)));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        getPlanes().sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
        return this;
    }

    public void print(Collection<? extends Plane> planes) {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes +
                '}';
    }
}
