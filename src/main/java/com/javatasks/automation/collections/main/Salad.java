package com.javatasks.automation.collections.main;

import com.javatasks.automation.collections.main.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Salad {
    private List<Vegetable> listOfVegetables;

    public Salad(List<Vegetable> listOfVegetables) {
        this.listOfVegetables = new ArrayList<>(listOfVegetables);
    }

    public List<? extends Vegetable> getListOfVegetables() {
        return listOfVegetables;
    }

    public void addVegetable(Vegetable... vegetables) {
        this.listOfVegetables.addAll(Arrays.asList(vegetables));
    }

    public double getSaladCalories() {
        double saladCalories = 0;
        for (Vegetable vegetable : listOfVegetables) {
            saladCalories += vegetable.getCalories();
        }
        return saladCalories;
    }

    public List<Vegetable> sortBy(SortingFilter filter) {
        ArrayList<Vegetable> salad = new ArrayList<>(listOfVegetables);
        if (filter.isByCalories()) {
            salad.sort(Comparator.comparing(Vegetable::getCalories));
        }
        if (filter.isByFats()) {
            salad.sort(Comparator.comparing(Vegetable::getFats));
        }
        if (filter.isByCarbohydrates()) {
            salad.sort(Comparator.comparing(Vegetable::getCarbohydrates));
        }
        if (filter.isByProteins()) {
            salad.sort(Comparator.comparing(Vegetable::getProteins));
        }
        if (filter.isByWeight()) {
            salad.sort(Comparator.comparing(Vegetable::getWeight));
        }
        return salad;
    }

    public List<Vegetable> listOfCaloriesRange(double from, double to) {
        List<Vegetable> listOfCaloriesRange = new ArrayList<>();
        for (Vegetable vegetable : listOfVegetables)
            if (vegetable.getCalories() > from && vegetable.getCalories() < to) {
                listOfCaloriesRange.add(vegetable);
            }
        return listOfCaloriesRange;
    }
}
