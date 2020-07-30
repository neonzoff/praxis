package com.sbrf.daytwo;

public class Task3 {
    public static void main(String[] args) {
        Vec vec1 = new Vec(1, 1, 1);
        Vec vec2 = new Vec(2, 2, 2);
        Vec plus = vec1.plus(vec2);
        Vec minus = vec1.minus(vec2);
        int scalar = vec1.scalarMult(vec2);
        double scalarCos = vec1.scalarMultCos(vec2);
        System.out.println(scalar);
        System.out.println(scalarCos);
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(vec2.length());
        System.out.println(vec1);
    }

}