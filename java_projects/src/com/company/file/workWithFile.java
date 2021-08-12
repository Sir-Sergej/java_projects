package com.company.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "/home/sergey/dataforjava/data.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}