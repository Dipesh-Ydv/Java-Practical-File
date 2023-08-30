package com.dipesh;

import java.util.Scanner;

public class Pr7 {
    public static void main(String[] args) {
        bank();
    }
    public static void bank() {
        Scanner input = new Scanner(System.in);
        String ans2 = "y";
        while (ans2.equals("y")) {
            System.out.println("-----WELCOME TO THE BANK-----");
            System.out.println("\n"+"---MENU---");
            System.out.println("1.Deposit the money in the bank");
            System.out.println("2.Withdraw the money from the bank");
            System.out.println("3.Display the amount stored in the bank");
            System.out.print("Enter your choice: ");
            int ans = input.nextInt();
            if (ans==1) {
                System.out.print("Enter the amount to deposit: ");
                int cash = input.nextInt();
                deposit(cash);
            }
            else if (ans==2){
                System.out.print("Enter the amount for withdrawl: ");
                int cash = input.nextInt();
                withdraw(cash);
            }
            else if (ans==3){
                display();
            }
            else{
                System.out.println("Wrong input :(");

            }
            System.out.print("Want to run again(y/n)?");
            ans2 = input.next();
        }
        input.close();
    }
    static int acc = 0;
    private static void display() {
        System.out.println("Your current balance is: " + acc);
    }

    private static void withdraw(int cash) {
        if (acc>cash) {
            acc = acc - cash;
            System.out.println("Money deducted from your account");
            display();
        } else {
            System.out.println("You are running out of balance :(");
            display();
        }
    }

    private static void deposit(int cash) {
        acc = acc + cash;
        System.out.println("Money added successfully :)");
        display();
    }
}