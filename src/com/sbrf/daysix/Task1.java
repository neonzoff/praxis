package com.sbrf.daysix;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        showMethods(Arrays.asList(test1,test2,new Object()));
    }

    public static void showMethods(List<?> objects) {
        for (Object object : objects) {
            Class<?> source = object.getClass();
            Method[] methods = source.getDeclaredMethods();
            for (Method method : methods) {
                method.setAccessible(true);
                System.out.println(method);
            }
            System.out.println();
        }
    }

}