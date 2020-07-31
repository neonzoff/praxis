package com.sbrf.dayfive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass<T> {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> boolean isBlank(List<E> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> E getLastElem(List<E> list) {
        if (list == null) {
            throw new IllegalArgumentException("list equals null");
        } else {
            E element = null;
            for (E e : list) {
                element = e;
            }
            return element;
        }
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> E findElem(List<E> list, E elem) {
        if (list == null || elem == null) {
            throw new IllegalArgumentException("null at arguments");
        } else {
            for (E tempElement : list) {
                if (tempElement.equals(elem)) {
                    return tempElement;
                }
            }
            return null;
        }
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <E> List<E> union(List<E> list1, List<E> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("null at arguments");
        } else {
            List<E> list = new ArrayList<>();
            list.addAll(list1);
            list.addAll(list2);
            return list;
        }
    }

    /**
     * Удаляет все элементы из списка list1 всех элементов, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <E> List<E> removeAll(List<E> list1, List<E> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("null at arguments");
        } else {
            List<E> list = new LinkedList<>(list1);
            for (E elem : list2) {
                list.remove(elem);
            }
            return list;
        }
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("null at arguments");
        } else {
            double sum = 0;
            for (Number number : list1) {
                sum += number.doubleValue();
            }
            for (Number number : list2) {
                sum += number.doubleValue();
            }
            return sum;
        }
    }
}

