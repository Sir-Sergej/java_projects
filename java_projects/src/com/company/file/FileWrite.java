package com.company.file;

import java.io.*;

public class FileWrite {

    public static void main(String[] args) throws IOException {

        try (PrintStream file = new PrintStream("/home/sergey/dataforjava/data.txt")) {

            for(int i = 0; i < 1000; i++) {
                file.print(i);
            }

        } catch (FileNotFoundException exp) {
            System.out.println("file not found");
        }
    }
}
