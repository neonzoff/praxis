package com.sbrf.daysix;

import java.lang.reflect.Field;
import java.util.*;

public class Task4 {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        Test1 test1 = new Test1("dmitry", 5, 10d, Arrays.asList(1, 2, 3, 4, 5));
        test1.setSet(new HashSet());
        Set set = test1.getSet();
        set.addAll(Arrays.asList(6, 7, 8, 9, 10));
        test1.setMap(new HashMap());
        Map map = test1.getMap();
        map.put("test", "map");
        Test2 test2 = new Test2("dmitry2", 10, 20, Arrays.asList(0, 0, 0, 0, 0));
        System.out.println(test2);
        System.out.println("\nПосле копирования:");
        copy(test1, test2);
        System.out.println(test2);
        System.out.println("\nПроверяем ссылки:");
        System.out.println(test1.getList() == test2.getList());
        System.out.println(test1.getSet() == test2.getSet());
        System.out.println(test1.getMap() == test2.getMap());

    }

    public static void copy(Object from, Object to) throws NoSuchFieldException, IllegalAccessException {
        Class<?> fromClass = from.getClass();
        Class<?> toClass = to.getClass();
        Field[] sourceFields = fromClass.getDeclaredFields();
        for (Field fromField : sourceFields) {
            Field toField = toClass.getDeclaredField(fromField.getName());
            toField.setAccessible(true);
            fromField.setAccessible(true);
            if (fromField.getType().equals(toField.getType())) {
                if (!(fromField.getType() == String.class || fromField.getType().isPrimitive())) {
                    if (fromField.getType().isAssignableFrom(List.class)) {
                        List list = (List) fromField.get(from);
                        List list1 = (List) toField.get(to);
                        ArrayList newList = new ArrayList(list);
                        toField.set(to, newList);
                    } else if (fromField.getType().isAssignableFrom(Set.class)) {
                        Set set = (Set) fromField.get(from);
                        Set set1 = (Set) toField.get(to);
                        HashSet newSet = new HashSet(set);
                        toField.set(to, newSet);
                    } else if (fromField.getType().isAssignableFrom(Map.class)) {
                        Map map = (Map) fromField.get(from);
                        Map map1 = (Map) toField.get(to);
                        HashMap newMap = new HashMap(map);
                        toField.set(to, newMap);
                    } else { //Class
                        Field source = fromField;
                        Field end = toField;
                        copy(source.get(from), end.get(to));
                    }
                } else {
                    toField.set(to, fromField.get(from));
                }
            }
        }
    }
}
