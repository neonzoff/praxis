package com.sbrf.daytwo;

public class Task2 {
    public static void main(String[] args) {
        ImNumber<Integer> t = new ImNumber<>(15, 15);
        ImNumber<Integer> t2 = new ImNumber<>(20, 10);
        System.out.println(t);
        System.out.println(t2);
        System.out.println("Сложение: " + t.plus(t2));
        System.out.println("Вычитание: " + t.minus(t2));
        System.out.println("Умножение: " + t.multiply(t2));

    }

}