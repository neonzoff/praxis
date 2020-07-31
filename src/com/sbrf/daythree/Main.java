package com.sbrf.daythree;

import com.sbrf.dayfour.IndexOutOfRangeException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.genericsTest();
    }

    public void genericsTest() {
        LList<Integer> list = new LList<>();
        list.add(5);
        list.add(2);
        list.add(1);
//        list.add(new Object()); //compile error
//        list.add("compile-error"); //compile error
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list);


        LList<Test> list1 = new LList<>();
        list1.add(new Test("first", 1));
        list1.add(new Test("second", 2));
//        list1.add(new Object()); //compile error
        System.out.println(list1.get(0));
        System.out.println(list1);
    }

    public void oldTest() {
        LList list = new LList();
        System.out.println("Размер: " + list.size());
        System.out.println("Пустой: " + list.isEmpty());
        list.add("Test0");
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        System.out.println("Содержит Test1: " + list.isContain("Test1"));
        System.out.println("Содержит Test 1: " + list.isContain("Test 1"));
        System.out.println("Размер: " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println("Первый элемент: " + list.getFirst());
        try {
            System.out.println(list.get(-1));
            System.out.println(list.get(5));
        } catch (IndexOutOfRangeException e) {
            System.out.println(e);
        }

        System.out.println("Содержимое списка: " + list);
        list.clear();
        System.out.println("Размер после очистки: " + list.size());
        System.out.println("Содержимое списка: " + list);
    }

}