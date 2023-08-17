package com.dipesh;

public class Pr7 {
    public static void main(String[] args) {
        Bank obj = new Bank("Dipesh Yadav", 4000);
        obj.display();

        int amt = obj.withdraw(10000);

        if (amt > 0) {
            System.out.println(amt + " : withdrawn successfully.");
        } else {
            System.out.println("Not Sufficient balance.\nTry again with lesser amount.");
        }

        obj.deposit(10000000);
        obj.display();

    }
    static class Bank {
        private String name;
        private int balance;

        public Bank(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }

        public void deposit(int amount) {
            this.balance += amount;
            System.out.printf("%d : deposited successfully.", amount);
            System.out.println("\nCurrent balance: " + balance);
        }

        public int withdraw(int amount) {
            if (amount < balance) {
                balance -= amount;
                return amount;
            }
            return -1;
        }

        public void display() {
            System.out.println("---- ACCOUNT DETAILS ----");
            System.out.println("Account holder name: " + name);
            System.out.println("Current balance: " + balance);
        }

    }
}
