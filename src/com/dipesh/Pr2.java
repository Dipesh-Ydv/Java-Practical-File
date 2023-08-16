package com.dipesh;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print series: ");
        int num = sc.nextInt();
        float ans = 1;

        for (int i = 2; i <= num; i++) {
            ans += ((float) 1 /i);
        }

        System.out.println("Sum of the series: " + ans);
    }
}
