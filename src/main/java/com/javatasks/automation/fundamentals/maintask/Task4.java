package com.javatasks.automation.fundamentals.maintask;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < args.length; i++) {
         if (args[i].matches("-?\\d*")) {
            numbers.add(Integer.parseInt(args[i]));
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            mul *= numbers.get(i);
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
