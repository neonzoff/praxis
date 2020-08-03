package com.sbrf.daysix;

public class  UsefulClass {
    private String test;
    private int id;

    public UsefulClass(String test, int id) {
        this.test = test;
        this.id = id;
    }

    @Override
    public String toString() {
        return test + " " + id;
    }
}