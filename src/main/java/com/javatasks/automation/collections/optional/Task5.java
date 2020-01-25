package com.javatasks.automation.collections.optional;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfRandomNumbers = createList();
        int sizeOfList = listOfRandomNumbers.size();
        for (int j = 0; j < sizeOfList; j++) {
            if (listOfRandomNumbers.get(j) >= 0) {
                listOfRandomNumbers.add(listOfRandomNumbers.get(j));
            }
        }

            for (int j = 0; j < sizeOfList; j++) {
            if(listOfRandomNumbers.get(j) < 0) {
                listOfRandomNumbers.add(listOfRandomNumbers.get(j));
            }
        }

        for (int i = 0; i < sizeOfList; i++) {
            listOfRandomNumbers.remove(0);
        }

        for (Integer number : listOfRandomNumbers){
            System.out.println(number);
        }
    }

    public static ArrayList<Integer> createList(){
        ArrayList<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfRandomNumbers.add(new Random().nextInt());
            System.out.println(listOfRandomNumbers.get(i));
        }
        System.out.println("");
        return listOfRandomNumbers;
    }
}
