package com.javatasks.automation.collections.optional;

import java.io.File;
import java.util.ArrayList;

public class Task3 {
    static ArrayList<File> dir = new ArrayList<File>();

    public static void main(String[] args) {
        File myDir = new File("E:\\testing");
        listOfFiles(myDir);
        for (int i = 0; i <dir.size(); i++) {
            System.out.println(dir.get(i));

        }
    }
    public static void listOfFiles(File file) {
        File[] folderContent =  file.listFiles();
        for (int i = 0; i < folderContent.length; i++) {
            if (!folderContent[i].isDirectory()) {
                dir.add(folderContent[i]);
            }
            else listOfFiles(folderContent[i]);
        }
    }
}
