package com.dipesh;

import java.util.Scanner;

public class Pr5 {
    static int first = 1;
    static int second = 1;
    static int next = 0;

    public static void main(String[] args) {
        System.out.print(first + " " + second + " ");
        printFibonacci(10);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number to print fibonacci series: ");
        int num = sc.nextInt();

        int n1 = 1;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < num - 2; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
    // Printing Fibonacci Series using recursion
    static void printFibonacci(int num) {
        if (num > 3) {
            printFibonacci(num - 1);
        }
        next = first + second;
        first = second;
        second = next;
        System.out.print(next + " ");
    }
}
