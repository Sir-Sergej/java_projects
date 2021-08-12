package com.company.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class renamefunction {
    public static void main(String[] args)  {
        String path = "/home/sergey/dataforjava";
        Scanner scanner = new Scanner(System.in);

        System.out.print("название файла, которого хотите изменить :");
        String fileName = scanner.nextLine();

        File file = new File(path, fileName);

        System.out.print("изменение названия на : ");
        String newFileName = scanner.nextLine();

        file.renameTo(new File(path, newFileName));
    }
}
