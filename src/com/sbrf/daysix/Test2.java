package com.sbrf.daysix;

public class Test2 {
    private String name;
    private int age;
    private int money;

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