package com.sbrf.daythree;

import com.sbrf.dayfour.IndexOutOfRangeException;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        LList list = new LList();
        System.out.println("Размер: " + list.size());
        System.out.println("Пустой: " + list.isEmpty());
        list.add("Test0");
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        System.out.println("Содержит Test1: " + list.isContain("Test1"));
        System.out.println("Содержит Test 1: " + list.isContain("Test 1"));
        list.add("Test4");
        System.out.println("Размер: " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        try {
            System.out.println(list.get(-1));
            System.out.println(list.get(5));
        } catch (IndexOutOfRangeException e) {
            System.out.println(e);
        }

        System.out.println(list);
    }
}


class LList {
    private Node root;

    private class Node {
        Object data;
        Node next;

        Node(Object item) {
            this.data = item;
        }
    }

    public void add(Object element) {
        if (element == null) return;
        Node node = new Node(element);
        Node last = getLast();

        if (last == null) {
            root = node;
        } else {
            last.next = node;
        }
    }

    public Object get(int index) {
        if (index + 1 > size() || index < 0) {
            throw new IndexOutOfRangeException("Индекс " + index + " вне допустимых значений");
        } else {
            Node currentNode = root;
            for (int i = 0; i != index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    public int size() {
        if (root == null) {
            return 0;
        } else {
            int count = 1;
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                count++;
            }
            return count;
        }

    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean isContain(Object o) {
        Node currentNode = root;
        while (currentNode.next != null) {
            if(currentNode.data.equals(o)) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    private Node getLast() {
        if (root == null) {
            return null;
        } else {
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }


    @Override
    public String toString() {
        if (root.next == null) {
            return "[ " + root.data + " ]";
        } else {
            StringJoiner sj = new StringJoiner(",", "[", "]");
            Node currentNode = root;
            while (currentNode != null) {
                sj.add(currentNode.data.toString());
                currentNode = currentNode.next;
            }
            return sj.toString();
        }
    }
}