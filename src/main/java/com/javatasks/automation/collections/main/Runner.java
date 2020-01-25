package com.javatasks.automation.collections.main;

import com.javatasks.automation.collections.main.vegetables.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
   static List<Vegetable> listOfVegetables = Arrays.asList(
    new Pumpkin(15.0, 0, 0.8, 3, 440.0, "Cucumber"),
    new Pumpkin(15,	0, 0.8,3,100,"Squash"),
           new Pumpkin(28, 0.3, 1.3, 7.7, 145, "Pumpkin"),
            new Cabbage(29, 0, 2.5, 4.9, 415, "Cauliflower"),
            new Cabbage(28, 0.4, 3, 5.2, 655, "Broccoli"),
            new RootCrop(33, 0.1, 1.3, 7, 470, "Carrot"),
            new RootCrop(45, 0, 3.7, 8.1, 250, "Parsley"),
            new RootCrop(48,0,1.7,10.8, 370, "Beet"),
            new RootCrop(20, 0, 1.2, 4.1, 560, "Radish"),
            new Tuber(83, 0,2,19.7, 830,"Potato"));

    public static void main(String[] args) {
Salad salad = new Salad(listOfVegetables);
Salad summerSalad = new Salad(salad.getSummerSalad());
        System.out.println("Amount Of Summer salad calories: " + summerSalad
                .getSaladCalories());
        System.out.println("Sort Summer salad by proteins: " + summerSalad
                .sortByProteins()
                .toString());
        System.out.println("Vegetables of a given calorie range: " + summerSalad
                .listOfCaloriesRange().toString());
    }
}
