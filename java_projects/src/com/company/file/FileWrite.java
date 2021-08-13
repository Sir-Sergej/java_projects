package com.company.file;

import java.io.*;

public class FileWrite {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/sergey/dataforjava/data.txt");
        try (PrintStream printstream = new PrintStream(file)) {

            for(int i = 0; i < 1000; i++) {
                printstream.print(i);
            }

        } catch (FileNotFoundException exp) {
            System.out.println("file not found");
        }

        FileReader reader = new FileReader(file);
        try (BufferedReader br = new BufferedReader(reader)) {
            String line = br.readLine();
            System.out.println(line + '\n');
        }
    }
}
