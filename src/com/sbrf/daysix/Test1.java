package com.sbrf.daysix;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    private String name;
    private int age;
    private double money;
    private List list;
    private Set set;
    private Map map;
//    private int[] arr;
    private UsefulClass usefulClass;

    public Test1() {
    }

    public Test1(String name, int age, double money, List<Object> list) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.list = list;
        usefulClass = new UsefulClass("test1", 1);
//        arr = new int[]{1, 2, 3, 4, 5};
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

//    public int[] getArr() {
//        return arr;
//    }

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
                + "\nMoney: " + money
                + "\nList: " + list
                + "\nSet: " + set
                + "\nMap: " + map
//                + "\nArray: " + arr
                + "\nClass: " + usefulClass;
    }
}

