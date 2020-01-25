package com.javatasks.automation.fundamentals.optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, ArrayList<String>> numbers = new TreeMap<>();
        int count = 0;

        while (true) {
          String s = reader.readLine();
            if (s.equals("")) {
                break;
            }
           int num = Math.abs(Integer.parseInt(s));
            while (num != 0) {
                num = num/ 10;
                count++;
            }
            numbers.putIfAbsent(count, new ArrayList<>());
            numbers.get(count).add(s);
            count = 0;
        }
        reader.close();

        for(ArrayList<String> a : numbers.values()) {
            for (int i = 0; i <a.size() ; i++) {
                System.out.println(a.get(i));
            }
        }
        System.out.println(" ");

        Map<Integer, ArrayList<String>> reversedNumbers = new TreeMap<>(Collections.reverseOrder());
        reversedNumbers.putAll(numbers);
        for(ArrayList<String> a : reversedNumbers.values()) {
            for (int i = 0; i <a.size() ; i++) {
                System.out.println(a.get(i));
            }
        }
    }
}