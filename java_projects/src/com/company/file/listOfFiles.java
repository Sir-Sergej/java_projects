package com.company.file;

import java.io.File;

public class listOfFiles {
    public static void main(String[] args) {
        File folder = new File("/home/sergey");

        for(File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
