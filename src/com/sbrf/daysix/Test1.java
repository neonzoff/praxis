package com.sbrf.daysix;

public class Test1 {
    private String name;
    private int age;
    private double money;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void fly() {
        System.out.println("test1 is flying!");
    }

    private void privateMethod1() {
        System.out.println("privateMethod1 of Test1");
    }

    public void publicMethod1() {
        System.out.println("publicMethod1 of Test1");
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nAge: " + age
                + "\nMoney: " + money;
    }
}
