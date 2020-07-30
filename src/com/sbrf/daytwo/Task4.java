package com.sbrf.daytwo;

public class Task4 {
    public static void main(String[] args) {
        Task4 test = new Task4();
        test.testTriangle();
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
        System.out.println("Площадь окружности: " + circle.area());
        circle.move();
        circle.print();
        System.out.println("Площадь окружности: " + circle.area());
        circle.multiply(0.5);
        System.out.println("Площадь окружности: " + circle.area());
        circle.print();
    }

    public void testPoint() {
        Point point = new Point();
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 4);
        System.out.println(point.findChetvert());
        System.out.println("Точки лежат на одной прямой: " + point.isCollinear(point1, point2));
        point1.setX(-1);
        point1.setY(5);
        System.out.println(point1.findChetvert());
        System.out.println("Равны ли точки: " + point2.equalsPoint(point1));
        point2.setX(-1);
        point2.setY(5);
        System.out.println("Равны ли точки: " + point2.equals(point1));
    }

    public void testTriangle() {
        Triangle triangle = new Triangle();
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        triangle.print();
        System.out.println("Площадь треугольника: " + triangle.area());
        triangle.multiply(0.5);
        System.out.println("Площадь треугольника: " + triangle.area());
        triangle.move();
        triangle.print();
    }

}