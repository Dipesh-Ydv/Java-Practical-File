package com.dipesh;

public class Pr3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command Line Arguments are: ");

            for (String str : args) {
                System.out.println(str);
            }
        } else {
            System.out.println("There are no Command Line Arguments");
        }
    }
}
