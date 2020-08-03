package com.sbrf.daysix;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
//        runFly(test1,test2);
        runFly(Arrays.asList(test1,test2,"test",new Object()));
    }


    public static <T> void runFly(List<T> objects) {
        for (T object : objects) {
            try {
                Class<T> clazz = (Class<T>) object.getClass();
                Method flyMethod = clazz.getDeclaredMethod("fly");
                flyMethod.setAccessible(true);
                flyMethod.invoke(object);
            } catch (NoSuchMethodException e) {
                System.out.println("Отсутствует метод fly");
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
