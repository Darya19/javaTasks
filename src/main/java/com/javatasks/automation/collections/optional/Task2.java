package com.javatasks.automation.collections.optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        char[] charArrayOfDigits = number.toCharArray();
        Stack<Integer> digits = new Stack<>();
        for (int i = 0;i<charArrayOfDigits.length; i++){
            int c = Character.getNumericValue(charArrayOfDigits[i]);
            digits.push(c);
        }
        reader.close();

       while(!digits.empty()){
            System.out.print(digits.pop());
        }
    }
}
