package com.javatasks.automation.collections.main;

import com.javatasks.automation.collections.main.vegetables.Cabbage;
import com.javatasks.automation.collections.main.vegetables.RootCrop;
import com.javatasks.automation.collections.main.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salad {
    private List<? extends Vegetable> listOfVegetables;

    public Salad(List<? extends Vegetable> listOfVegetables) {
        this.listOfVegetables = listOfVegetables;
    }

    public List<? extends Vegetable> getListOfVegetables() {
        return listOfVegetables;
    }

    public List<Vegetable> getSummerSalad() {
        ArrayList<Vegetable> summerSalad = new ArrayList<>();
        for (Vegetable vegetable : listOfVegetables) {
            if (vegetable instanceof RootCrop)
                summerSalad.add(vegetable);
            if(vegetable instanceof Cabbage) {
                summerSalad.add(vegetable);
            }
        }
        return summerSalad;
    }

    public double getSaladCalories(){
        double saladCalories = 0;
        for(Vegetable vegetable : getSummerSalad()){
          saladCalories += vegetable.getCalories();
        }
        return saladCalories;
    }

    public List<Vegetable> sortByProteins(){
        ArrayList<Vegetable> summerSalad = new ArrayList<>(getSummerSalad());
        summerSalad.sort(Comparator.comparing(Vegetable::getProteins));
       return summerSalad;
    }

    public  List<Vegetable> listOfCaloriesRange(){
     List<Vegetable> listOfCaloriesRange = new ArrayList<>();
     for (Vegetable vegetable : getSummerSalad())
     if(vegetable.getCalories() > 10 && vegetable.getCalories() < 30){
         listOfCaloriesRange.add(vegetable);
     }
     return listOfCaloriesRange;
    }
}
