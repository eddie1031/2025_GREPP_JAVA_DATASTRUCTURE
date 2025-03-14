package io.eddie.stack;

import io.eddie.arrayList.List;
import io.eddie.linkedList.LinkedList;

public class Stack<E> implements List<E> {

    private Object[] elements = {};

    public void push(E e) {

        Object[] temp = new Object[elements.length + 1];

        for ( int i = 0; i < elements.length; i++ ) {
            temp[i] = elements[i];
        }

        temp[elements.length] = e;
        elements = temp;

    }

    @SuppressWarnings("all")
    public E pop() {

        Object[] temp = new Object[elements.length - 1];
        E target = (E) elements[elements.length - 1];

        for ( int i = 0; i < elements.length - 1; i++ ) {
            temp[i] = elements[i];
        }

        elements = temp;

        return target;

    }


    @Override
    public void add(int index, E e) {
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public void add(E e) {
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }
}
