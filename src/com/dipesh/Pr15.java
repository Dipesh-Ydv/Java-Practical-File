package com.dipesh;


import java.util.Arrays;

public class Pr15 {
    public static void main(String[] args) {
        String[] nameArr = {"Dipesh", "Ankita", "Varshank", "Ayush", "Vishal", "Jimmy"};
        sortNameList(nameArr);

        System.out.println(Arrays.toString(nameArr));
    }
    static void sortNameList(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 1; j < names.length - i; j++) {
                if (names[j-1].compareTo(names[j]) > 0) {
                    String temp = names[j];
                    names[j] = names[j-1];
                    names[j-1] = temp;
                }
            }
        }
    }
}
