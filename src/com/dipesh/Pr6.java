package com.dipesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pr6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rd);

        // Reading employee details using BufferedReader
        System.out.println("Enter employee ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter employee name: ");
        String name = br.readLine();

        System.out.println("Enter employee department: ");
        String department = br.readLine();

        // Displaying employee details
        System.out.println("---- EMPLOYEE DETAILS ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
