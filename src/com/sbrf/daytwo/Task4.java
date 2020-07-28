package com.sbrf.daytwo;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 test = new Task4();
        test.testPoint();
    }

    public void testCircle() {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2, 2, 2);
        System.out.println("Длина окружности circle: " + circle.getLength());
        System.out.println("Расстояние от центра окружности circle до circle1: " + circle.getDistance(circle1));
        System.out.println("Соприкасается ли окружность circle с circle1: " + circle.isTouchWith(circle1));
        System.out.println("Содержит ли окружность circle точку с координатами [ 2 ; 2 ]: " + circle.isContain(2, 2));
        System.out.println("Содержит ли окружность circle внутри окружность circle1: " + circle.isContainCircle(circle1));
        circle.print();
        circle.area();
        circle.move();
        circle.print();
        circle.area();
        circle.multiply(0.5);
        circle.area();
        circle.print();
    }

    public void testPoint() {
        Point point = new Point();
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        point.findChetvert();
        System.out.println("Точки лежат на одной прямой: " + point.isCollinear(point1, point2));
        point1.setX(-1);
        point1.setY(5);
        point1.findChetvert();
        System.out.println("Равны ли точки: " + point2.equalsPoint(point1));
        point2.setX(-1);
        point2.setY(5);
        System.out.println("Равны ли точки: " + point2.equals(point1));
    }
}


abstract class Figure {

    abstract void print();

    abstract void move();

    abstract void multiply(double coefficient);

    abstract void area();
}

class Circle extends Figure {
    private final double PI = 3.14;
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

    double getLength() {
        return 2 * PI * radius;
    }

    double getDistance(Circle circle) {
        return Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
    }

    boolean isTouchWith(Circle circle) {
        return Math.abs(this.radius + circle.radius - getDistance(circle)) <= 0;
    }

    boolean isContain(double x, double y) {
        return (Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= Math.pow(radius, 2);
    }

    boolean isContainCircle(Circle circle) {
        if (isContain(circle.x, circle.y)) {
            return getDistance(circle) < (this.radius - circle.radius);
        }
        return false;
    }

    @Override
    void print() {
        System.out.println("Окружность с координатами: [ " + x + " ; " + y + " ] и радиусом: " + radius);
    }

    @Override
    void move() {
        Random random = new Random();
        int randX = random.nextInt(100);
        int randY = random.nextInt(100);
        this.x += randX;
        this.y += randY;
    }

    @Override
    void multiply(double coefficient) {
        this.radius *= coefficient;
    }

    @Override
    void area() {
        System.out.println("Площадь окружности: " + (PI * Math.pow(radius, 2)));
    }
}

class Point {
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

    void findChetvert() {
        if (x > 0 && y > 0) {
            System.out.println("Точка лежит в I четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка лежит во II четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка лежит в III четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка лежит в IV четверти");
        } else {
            System.out.println("Точка лежит на прямой");
        }
    }

    boolean equalsPoint(Point point) {
        return Math.abs(x) == Math.abs(point.x) && Math.abs(y) == Math.abs(point.y);
    }

    boolean isCollinear(Point point1, Point point2) {
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
}