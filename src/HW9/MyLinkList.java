package HW9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyLinkList<T>{

    private class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> head = null;


    public int size() {
        Node<T> p;
        int size = 0;
        for (p = head; p != null; p = p.next) {
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(T o) {
        if (isEmpty()) {
            return false;
        }
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            if (p.value.equals(o)) {
                return true;
            }
        }
        return false;
    }


    public Object[] toArray() {
        if (isEmpty()) {
            return null;
        }
        int length = size(), i = 0;
        Object[] a = new Object[length];
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            a[i] = p.value;
            i++;
        }
        return a;
    }

    public boolean add(T o) {
        if (isEmpty()) {
            head = new Node<T>(o);
            return true;
        } else {
            Node<T> p = head;
            Node<T> node = new Node<T>(o);
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
            node.next = null;
            return true;
        }
    }

    public boolean delete(T o) {
        Node<T> p = head, p1 = null;
        boolean have = false;
        if (isEmpty()) {
            return false;
        }
        while (p != null) {
            if (p.value.equals(o)) {
                if (p1 == null) {
                    head = head.next;
                } else {
                    p1.next = p.next;
                }
                have = true;
            }
            p1 = p;
            p = p.next;
        }
        return have;
    }


    public boolean clear() {
        head = null;
        return true;
    }

    public T get(int index) {
        int i = -1;
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }
        Node<T> p = head;
        while (p != null) {
            i++;
            if (i == index) {
                return p.value;
            }
            p = p.next;
        }
        return null;
    }

    public T set(int index, T element) {
        int i = -1;
        if (isEmpty()) {
            add(element);
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }
        Node<T> p = head;
        T o = null;
        while (p != null) {
            i++;
            if (i == index) {
                o = p.value;
                p.value = element;
                return o;
            }
            p = p.next;
        }
        return null;
    }



    public boolean addAll(Collection c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            T o = (T) it.next();
            add(o);
        }
        return true;
    }
    public boolean addAll(T[] elements){
        if (elements == null || elements.length == 0){
            return false;
        }
        for (int i = 0; i < elements.length; i++) {
            add(elements[i]);
        }
        return true;
    }

    public boolean delete(int index) {
        if (isEmpty()) {
            return false;
        }
        if (index < 0 || index > size()) {
            return false;
        }
        Node<T> p = head, p1 = null;
        int i = -1;
        while (p != null) {
            i++;
            if (i == index) {
                if (p1 == null) {
                    head = head.next;
                } else {
                    p1.next = p.next;
                }
                return true;
            }
            p1 = p;
            p = p.next;
        }
        return true;
    }


    public void printLinkList() {
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            System.out.print(p.value + "--->");
        }
        System.out.println();
    }
}

