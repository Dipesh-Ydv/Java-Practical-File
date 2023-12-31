package com.dipesh;

import java.io.File;
import java.util.Scanner;

public class Pr17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        System.out.println("File exists: " + file.exists());
        System.out.println("File is readable: " + file.canRead());
        System.out.println("File is writable: " + file.canWrite());
        System.out.println("File type: " + getFileType(file));
        System.out.println("File length in bytes: " + file.length());
    }

    private static String getFileType(File file) {
        if (file.isDirectory()) {
            return "Directory";
        } else if (file.isFile()) {
            return "File";
        } else {
            return "Unknown";
        }
    }
}
