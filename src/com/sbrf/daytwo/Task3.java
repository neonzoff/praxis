package com.sbrf.daytwo;

public class Task3 {
    public static void main(String[] args) {
        Vec vec1 = new Vec(1, 1);
        Vec vec2 = new Vec(2, 2);
        Vec plus = vec1.plus(vec2);
        Vec minus = vec1.minus(vec2);
        int scalar = vec1.scalarMult(vec2);
        System.out.println(scalar);
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(vec2.length());
        System.out.println(vec1);
    }
}

class Vec {
    private int start;
    private int end;

    public Vec(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "( " + start + " , " + end + " )";
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(start, 2) + Math.pow(end, 2));
    }

    public Vec plus(Vec o) {
        int tempStart = this.start + o.start;
        int tempEnd = this.end + o.end;
        return new Vec(tempStart, tempEnd);
    }

    public Vec minus(Vec o) {
        int tempStart = this.start - o.start;
        int tempEnd = this.end - o.end;
        return new Vec(tempStart, tempEnd);
    }

    public int scalarMult(Vec o) {
        int tempStart = this.start * o.start;
        int tempEnd = this.end * o.end;
        return tempStart + tempEnd;
    }
}

