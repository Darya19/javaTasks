package com.javatasks.automation.collections.main.vegetables;

import java.util.Objects;

public class Pumpkin extends Vegetable{
    String name;

    public Pumpkin(double calories, double fats, double proteins, double carbohydrates, double weight, String name) {
        super(calories, fats, proteins, carbohydrates, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pumpkin{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pumpkin pumpkin = (Pumpkin) o;
        return Objects.equals(name, pumpkin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
