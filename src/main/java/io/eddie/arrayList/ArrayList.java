package io.eddie.arrayList;

import io.eddie.stream.ListStream;
import io.eddie.stream.Stream;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {

    private Object[] elements = {};

    @Override
    public void add(E e) {

        Object[] temp = new Object[elements.length + 1];

        for ( int i = 0; i < elements.length; i++ ) {
            temp[i] = elements[i];
        }

        temp[elements.length] = e;
        elements = temp;

    }

    @Override
    public void add(int index, E e) {

        Object[] temp = new Object[elements.length + 1];

        for ( int i = 0, j = 0; i < temp.length; i++ ) {
            if ( i == index ) {
                temp[i] = e;
            } else {
                temp[i] = elements[j++];
            }
        }

        elements = temp;

    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public E set(int index, E e) {
        elements[index] = e;
        return e;
    }

    @Override
    public E remove(int index) {

        Object[] temp = new Object[elements.length - 1];

        E target = get(index);

        for ( int i = 0, j = 0; i < elements.length; i++) {
            if ( i == index ) {
                continue;
            }
            temp[j++] = elements[i];
        }

        elements = temp;

        return target;
    }

    @Override
    public boolean contains(E e) {

        for ( int i = 0; i < elements.length; i++ ) {
            if ( elements[i].equals(e) ) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void remove(E e) {

        if ( !contains(e) ) {
            return;
        }

        Object[] temp = new Object[elements.length - 1];

        boolean flag = false;

        for ( int i = 0, j = 0; i < elements.length; i++ ) {

            if ( !flag && elements[i].equals(e) ) {
                flag = true;
                continue;
            }

            temp[j++] = elements[i];

        }

        elements = temp;

    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public int size() {
        return elements.length;
    }

    public void print() {
        for ( int i = 0; i < elements.length; i++ ) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {

        // current index
        private int curIdx = 0;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return curIdx < elements.length;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        @SuppressWarnings("all")
        public E next() {

            if ( !hasNext() ) {
                throw new NoSuchElementException();
            }

            return (E) elements[curIdx++];
        }

    }

    @Override
    public Stream<E> stream() {
        return new ListStream<>(this);
    }

}
