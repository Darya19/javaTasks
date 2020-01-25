package com.javatasks.automation.fundamentals.maintask;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Object> listOfArguments = Arrays.asList(args);
        Collections.reverse(listOfArguments);
        System.out.println(listOfArguments);



    }
}
