package com.javatasks.automation.fundamentals.maintask;

import org.apache.commons.lang3.RandomUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {
            Random num = new Random();
            numbers[i] = num.nextInt();
            System.out.println(numbers[i] + " ");
        }
        reader.close();

        for (int i = 0; i < a; i++) {
            System.out.print(numbers[i] + " ");}
    }
}
