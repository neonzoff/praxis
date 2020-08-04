package com.sbrf.dayseven;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        init();
    }


    public static void init() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("com.sbrf.dayseven");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Plugin.class);
        for (Class<?> clazz : classes) {
            System.out.println("Plugin: " + clazz.getCanonicalName());
        }
        for (Class<?> clazz : classes) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(RunMe.class)) {
                    method.setAccessible(true);
                    method.invoke(clazz.newInstance());
                }
            }
        }
    }
}

