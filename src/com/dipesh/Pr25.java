package com.dipesh;

public class Pr25 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ramphal", "Developer", 696969);
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        int calculatedSalary = salaryCalculator.calculateSalary(employee);
        System.out.println("The calculated salary is: " + calculatedSalary);
    }
}

class Employee {
    private int id;
    private String name;
    private String role;
    private int salary;

    public Employee(int id, String name, String role, int salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }
}

interface CalculateSalary {
    int calculateSalary(Employee employee);
}

class SalaryCalculator implements CalculateSalary {
    @Override
    public int calculateSalary(Employee employee) {
        return switch (employee.getRole()) {
            case "Developer" -> employee.getSalary() * 12;
            case "Manager" -> employee.getSalary() * 14;
            default -> 0;
        };
    }
}