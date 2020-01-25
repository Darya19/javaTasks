package com.javatasks.automation.fundamentals.optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, ArrayList<String>> numbers = new HashMap<>();
        String s = null;
        int num = 0;
        int count = 0;
        int p = 0;
        while (true) {
            s = reader.readLine();
            if (s.equals("")) {
                break;
            }
            num = Math.abs(Integer.parseInt(s));
            while (num != 0) {
                num = num/ 10;
                count++;
            }
            numbers.putIfAbsent(count, new ArrayList<>());
            numbers.get(count).add(s);
            count = 0;
        }
        reader.close();

       for (Integer key  : numbers.keySet()) {
                 num += key * numbers.get(key).size();
                 p += numbers.get(key).size();
              }
       num = num/p;

       for (Integer key : numbers.keySet()) {
            if (key > num) {
                for (int i = 0; i < numbers.get(key).size() ; i++) {
                    System.out.println(numbers.get(key).get(i));
                }
            }
       }

        for (Integer key : numbers.keySet()) {
            if (key < num) {
                for (int i = 0; i < numbers.get(key).size() ; i++) {
                    System.out.println(numbers.get(key).get(i));
                }
            }
        }
    }
}
