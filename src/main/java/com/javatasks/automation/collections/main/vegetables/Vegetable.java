package com.javatasks.automation.collections.main.vegetables;

import java.util.Objects;

public abstract class Vegetable {
    private double calories;
    private double fats;
    private double proteins;
    private double carbohydrates;
    private double weight;

    public Vegetable(double calories, double fats, double proteins, double carbohydrates, double weight) {
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "calories=" + calories +
                ", fats=" + fats +
                ", proteins=" + proteins +
                ", carbohydrates=" + carbohydrates +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.calories, calories) == 0 &&
                Double.compare(vegetable.fats, fats) == 0 &&
                Double.compare(vegetable.proteins, proteins) == 0 &&
                Double.compare(vegetable.carbohydrates, carbohydrates) == 0 &&
                Double.compare(vegetable.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, fats, proteins, carbohydrates, weight);
    }
}
