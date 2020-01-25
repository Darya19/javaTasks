package com.javatasks.automation.collections.optional;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        List<String> poem = Files.readAllLines(Paths.get("src\\main\\resources\\poem.txt"), Charset.defaultCharset());
        Collections.sort(poem, Comparator.comparingInt(String::length));
        for (String s: poem ){
            System.out.println(s);
        }
    }
}
