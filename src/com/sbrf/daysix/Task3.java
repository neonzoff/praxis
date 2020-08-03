package com.sbrf.daysix;

import java.lang.reflect.Field;

public class Task3 {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setName("NeDmitry");
        test1.setAge(5);
        test1.setMoney(.55d);
        Test2 test2 = new Test2();
        test2.setName("Dmitry");
        test2.setAge(10);
        test2.setMoney(300);
        System.out.println("До копирования:\n" + test1 + " \n\n" + test2);
        copy(test1,test2);
        System.out.println("\nПосле копирования:\n" + test1 + " \n\n" + test2);
    }


    public static void copy(Object in, Object out) {
        Class inClass = in.getClass();
        Class outClass = out.getClass();
        Field[] inFields = inClass.getDeclaredFields();
        for (Field inField : inFields) {
            try {
                Field outField = outClass.getDeclaredField(inField.getName());
                if (outField.getType().equals(inField.getType())) {
                    inField.setAccessible(true);
                    outField.setAccessible(true);
                    outField.set(out, inField.get(in));
                }
            } catch (NoSuchFieldException e) {
                System.out.println("Отсутствует поле");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
