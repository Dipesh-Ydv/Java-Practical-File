package com.dipesh;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        float radius = sc.nextFloat();

        System.out.println("Area of circle is: " + circleArea(radius));
    }
    static float circleArea(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}
