package com.sbrf.daysix;

import java.util.List;

public class Test2 {
    private String name;
    private int age;
    private int money;
    private List<Object> list;

    public Test2() {
    }

    public Test2(String name, int age, int money, List<Object> list) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    private void fly() {
        System.out.println("test2 is flying!");
    }

    void defaultMethod1() {
        System.out.println("defaultMethod1 of Test2");
    }

    protected void protectedMethod1() {
        System.out.println("protectedMethod1 of Test2");
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nAge: " + age
                + "\nMoney: " + money;
    }
}