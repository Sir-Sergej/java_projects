package com.company.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Main1 {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "/home/sergey/dataforjava/data.txt";
        File file = new File(path);


        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");


        System.out.println(Arrays.toString(words));
    }
}