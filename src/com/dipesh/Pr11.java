package com.dipesh;

import java.util.Scanner;

public class Pr11 {

    // Define instance variables
    private String name;
    private int id;
    private double salary[];

    // Create a parameterized constructor
    public Pr11(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = new double[12];
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double[] getSalary() {
        return salary;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        String name = scanner.nextLine();
        System.out.println("Enter the id of the employee:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the new line character
        Pr11 employee = new Pr11(name, id);

        for (int i = 0; i < 12; i++) {
            System.out.println("Enter the salary for the month " + (i + 1) + ":");
            employee.salary[i] = scanner.nextDouble();
        }

        double grossSalary = employee.calculateGrossSalary();
        System.out.println("The gross salary of the employee is: " + grossSalary);
    }
}
