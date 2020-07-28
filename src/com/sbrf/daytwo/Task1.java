package com.sbrf.daytwo;

import java.util.*;

public class Task1 {
    private static final Scanner in = new Scanner(System.in);
    private final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.init();
    }

    private void init() {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить сотрудника");
            System.out.println("2.Вывести информацию о сотрудниках");
            System.out.println("3.Вывести сотрудников на заданной должности");
            System.out.println("4.Сортировать сотрудников по фамилии и зарплате");
            System.out.println("0.Выход");
            int action = in.nextInt();
            switch (action) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    printByPosition();
                    break;
                case 4:
                    sortByPositionAndSalary();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Не верно указано действие\n");
            }
        }
    }

    private void addEmployee() {
        System.out.println("Введите фамилию");
        String surName = in.next();
        System.out.println("Введите имя");
        String name = in.next();
        System.out.println("Введите должность");
        String position = in.next();
        System.out.println("Введите зарплату");
        int salary = in.nextInt();
        employees.add(new Employee(surName, name, position, salary));
        System.out.println("Сотрудник успешно добавлен\n");
    }

    private void print() {
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println();
    }

    private void printByPosition() {
        System.out.println("Введите должность:");
        boolean isFound = false;
        String position = in.next();
        for (Employee e : employees) {
            if (e.getPosition().equals(position)) {
                System.out.println(e + "\n");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Сотрудников с должностью " + position + " не найдено\n");
        }
    }

    private void sortByPositionAndSalary() {
        Comparator<Employee> comparator = Comparator.comparing(Employee::getSurName);
        comparator = comparator.thenComparing(Employee::getSalary);
        employees.sort(comparator);
    }


}

class Employee {
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