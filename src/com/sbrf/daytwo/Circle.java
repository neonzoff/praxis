package com.sbrf.daytwo;

import java.util.Random;
import java.util.Scanner;

public class Circle extends Figure {
    private final double PI = Math.PI;
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату Х: ");
        this.x = in.nextDouble();
        System.out.print("Введите координату Y: ");
        this.y = in.nextDouble();
        System.out.print("Введите радиус: ");
        this.radius = in.nextDouble();
    }

    public double getLength() {
        return 2 * PI * radius;
    }

    public double getDistance(Circle circle) {
        return Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
    }

    public boolean isTouchWith(Circle circle) {
        return Math.abs(this.radius + circle.radius - getDistance(circle)) <= 0;
    }

    public boolean isContain(double x, double y) {
        return (Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= Math.pow(radius, 2);
    }

    public boolean isContainCircle(Circle circle) {
        if (isContain(circle.x, circle.y)) {
            return getDistance(circle) < (this.radius - circle.radius);
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println("Окружность с координатами: [ " + x + " ; " + y + " ] и радиусом: " + radius);
    }

    @Override
    public void move() {
        Random random = new Random();
        int randX = random.nextInt(100);
        int randY = random.nextInt(100);
        this.x += randX;
        this.y += randY;
    }

    @Override
    public void multiply(double coefficient) {
        this.radius *= coefficient;
    }

    @Override
    public double area() {
        return (PI * Math.pow(radius, 2));
    }
}
