package com.sbrf.daysix;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    private String name;
    private int age;
    private int money;
    private List list;
    private Set set;
    private Map map;
//    private int[] arr;
    private UsefulClass usefulClass;

    public Test2() {
    }

    public Test2(String name, int age, int money, List<Object> list) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.list = list;
        usefulClass = new UsefulClass("test2", 2);
//        arr = new int[]{0, 0, 0, 0};
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
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
                + "\nMoney: " + money
                + "\nList: " + list
                + "\nSet: " + set
                + "\nMap: " + map
//                + "\nArray: " + arr
                + "\nClass: " + usefulClass;
    }
}