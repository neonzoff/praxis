package com.sbrf.daytwo;

public class Employee {
    private String surName;
    private String name;
    private String position;
    private int salary;

    public Employee(String surName, String name, String position, int salary) {
        this.surName = surName;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + surName + " " + name +
                "\n Должность: " + position +
                "\n Зарплата: " + salary;
    }

}
