package com.javatasks.automation.collections.optional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args)  {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src\\main\\resources\\file.txt"), Charset.defaultCharset());
            FileWriter writer = new FileWriter(new File("src\\main\\resources\\reverseOrderFile.txt"), false);
            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i) + "\n");
                writer.flush();
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
