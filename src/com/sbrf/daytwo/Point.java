package com.sbrf.daytwo;

import java.util.Objects;
import java.util.Scanner;

public class Point {                //точка - абстрактное понятие, сомневаюсь, что от Figure нужно наследоваться, нет площади и невозможно масштабировать
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату X: ");
        this.x = in.nextDouble();
        System.out.print("Введите координату Y: ");
        this.y = in.nextDouble();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String findChetvert() {
        if (x > 0 && y > 0) {
            return ("Точка лежит в I четверти");
        } else if (x < 0 && y > 0) {
            return ("Точка лежит во II четверти");
        } else if (x < 0 && y < 0) {
            return ("Точка лежит в III четверти");
        } else if (x > 0 && y < 0) {
            return ("Точка лежит в IV четверти");
        } else {
            return ("Точка лежит на прямой");
        }
    }

    public boolean equalsPoint(Point point) {
        return Math.abs(x) == Math.abs(point.x) && Math.abs(y) == Math.abs(point.y);
    }

    public boolean isCollinear(Point point1, Point point2) {
        return ((point2.x - this.x) / (point1.x - this.x) == (point2.y - this.y) / (point1.y - this.y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "[ " + x + " , " + y + " ]";
    }
}
