package com.dipesh;

import java.util.Scanner;

public class Pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print primes till it: ");
        int num = sc.nextInt();

        System.out.printf("Prime numbers till %d are: ", num);
        reqPrimes(num);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void reqPrimes(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
