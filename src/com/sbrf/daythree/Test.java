package com.sbrf.daythree;

public class Test {
    private String name;
    private int id;

    public Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "(" + name + "," + id + ")";
    }
}
