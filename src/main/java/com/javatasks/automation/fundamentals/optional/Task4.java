package com.javatasks.automation.fundamentals.optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> numbers = new TreeMap<>();
        String s = null;
        int min = Integer.MAX_VALUE;

        while (true) {
            int digits = 1;
            s = reader.readLine();
            if (s.equals("")) {
                break;
            }
            List<Integer> tmp = new ArrayList<>();
            int c = Math.abs(Integer.parseInt(s));
            while (c != 0){
                tmp.add(c % 10);
               c /= 10;
            }
           Collections.sort(tmp);
            for (int i = 0; i < tmp.size() - 1; i++) {
                    if (tmp.get(i) != tmp.get(i + 1)) {
                        digits += 1;
                    }
            }
            if (min > digits) {min = digits;}
            numbers.putIfAbsent(digits, s);
            digits = 1;
        }
        reader.close();
        System.out.println(numbers.get(min));
    }
}