package com.dipesh;

public class Pr21 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle", 5, 4);
        Shape circle = new Circle("Circle", 3);

        System.out.println("Area of " + rectangle.name + ": " + rectangle.calculateArea());
        System.out.println("Area of " + circle.name + ": " + circle.calculateArea());
    }
}

abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(String name, double length, double breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}