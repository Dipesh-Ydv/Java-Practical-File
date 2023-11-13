package com.dipesh;

import java.util.Scanner;

public class Pr34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Text: ");
        String txt = sc.nextLine();

        System.out.print("Enter a character to count its occurrence: ");
        String word = sc.next();

        String[] temp = txt.split(" ");
        int count = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(word)) {
                count++;
            }
        }

        System.out.println("Total number of occurrence of " + word + " is: " + count);
    }
}
