/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar_26052023;

/**
 *
 * @author Dell
 */
abstract class Shape {
    public abstract double getArea();
    public abstract String getName();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }

    public void displayInfo() {
        System.out.println("This is a circle.");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }

    public void displayInfo() {
        System.out.println("This is a square.");
        System.out.println("Side length: " + side);
        System.out.println("Area: " + getArea());
    }
}