package com.sbrf.daythree;

import com.sbrf.dayfour.IndexOutOfRangeException;

import java.util.StringJoiner;

public class LList<E> {
    private Node root;

    private class Node {
        E data;
        Node next;

        Node(E item) {
            this.data = item;
        }
    }

    public void add(E element) {
        if (element == null) return;
        Node node = new Node(element);
        Node last = getLast();

        if (last == null) {
            root = node;
        } else {
            last.next = node;
        }
    }

    public E get(int index) {
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

    public boolean isContain(E o) {
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.data.equals(o)) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    public void clear() {
        for (Node currentNode = root; currentNode != null; ) {
            Node next = currentNode.next;
            currentNode.data = null;
            currentNode.next = null;
            currentNode = next;
        }
        root = null;
    }

    public E getFirst() {
        if (!isEmpty()) {
            return root.data;
        }
        return null;
    }

    private Node getLast() {
        if (isEmpty()) {
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
        if (!isEmpty()) {
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
        return null;
    }
}
