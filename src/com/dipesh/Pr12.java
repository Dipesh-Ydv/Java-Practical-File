package com.dipesh;

import java.util.Scanner;

public class Pr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.printf("HCF of %d and %d is %d", first, second, hcf(first, second));
        System.out.printf("\nLCM of %d and %d is %d", first, second, lcm(first, second));
    }
    static int hcf(int num1, int num2) {
        // HCF is always smaller than or equal to the smallest number
        int smaller = num1 < num2 ? num1 : num2;

        for (int i = smaller; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int lcm(int num1, int num2) {
        /*
        LCM * HCF = Product of those numbers
         */
        return (num1 * num2) / hcf(num1, num2);
    }
}
