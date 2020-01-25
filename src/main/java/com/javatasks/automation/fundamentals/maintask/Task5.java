package com.javatasks.automation.fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.YearMonth;

public class Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введи число от 1 до 12");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0 && num < 13) {
            System.out.println(Month.of(num));
        }
        else System.out.println("Неверное число");
        reader.close();
    }
}
