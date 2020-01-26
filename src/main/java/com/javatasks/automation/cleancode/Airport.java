package com.javatasks.automation.cleancode;

import com.javatasks.automation.cleancode.models.MilitaryType;
import com.javatasks.automation.cleancode.planes.ExperimentalPlane;
import com.javatasks.automation.cleancode.planes.MilitaryPlane;
import com.javatasks.automation.cleancode.planes.PassengerPlane;
import com.javatasks.automation.cleancode.planes.Plane;

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
        return extractPlanesByType(PassengerPlane.class);
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        return extractPlanesByType(MilitaryPlane.class);
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        return extractPlanesByType(ExperimentalPlane.class);
    }

    private <T> List<T> extractPlanesByType(Class<T> clazz) {
        List<T> planes = new ArrayList<>();
        for (Plane plane : getPlanes()) {
            if (clazz.isInstance(plane)) {
                planes.add((T) plane);
            }
        }
        return planes;
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
        return getPassengerPlanes()
                .stream()
                .max(Comparator.comparingInt(PassengerPlane::getPassengersCapacity))
                .orElseThrow(() -> new NullPointerException("Empty passenger planes list"));
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
        planes.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes +
                '}';
    }
}
