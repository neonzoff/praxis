package com.sbrf.daytwo;

public class Triangle extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }


    @Override
    public void print() {
        System.out.println("Треугольник с вершинами: " + p1 + " " + p2 + " " + p3);
    }

    @Override
    public void move() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    @Override
    public void multiply(double coefficient) {
        p1.setX(p1.getX() * coefficient);
        p1.setY(p1.getY() * coefficient);
        p2.setX(p2.getX() * coefficient);
        p2.setY(p2.getY() * coefficient);
        p3.setX(p3.getX() * coefficient);
        p3.setY(p3.getY() * coefficient);
    }

    public double perimeter() {
        double ab = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
        double bc = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
        double ca = Math.sqrt(Math.pow((p3.getX() - p1.getX()), 2) + Math.pow((p3.getY() - p1.getY()), 2));
        return ab + bc + ca;
    }

    @Override
    public void area() {
        double halfOfPerimeter = perimeter() / 2;
        double ab = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
        double bc = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
        double ca = Math.sqrt(Math.pow((p3.getX() - p1.getX()), 2) + Math.pow((p3.getY() - p1.getY()), 2));
        System.out.println("Площадь: " + Math.sqrt(halfOfPerimeter * (halfOfPerimeter - ab) * (halfOfPerimeter - bc) * (halfOfPerimeter - ca)));
    }

}