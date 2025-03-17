package io.eddie.queue;

import io.eddie.Collection;
import io.eddie.linkedList.LinkedList;
import io.eddie.stream.Stream;

import java.util.Iterator;

public class Queue<E> implements Collection<E> {

    private final LinkedList<E> elements;

    public Queue() {
        this.elements = new LinkedList<>();
    }

    public void offer(E e) {
        elements.addLast(e);
    }

    public E poll() {
        if ( isEmpty() ) {
            return null;
        }
        return elements.removeFirst();
    }

    public E peek() {
        if ( isEmpty() ) {
            return null;
        }
        return elements.get(0);
    }


    @Override
    public void add(E e) {
        offer(e);
    }

    @Override
    public void remove(E e) {
        if ( peek().equals(e) ) {
            poll();
        }
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean contains(E e) {
        return elements.contains(e);
    }

    public void print() {
        elements.traverse();
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public Stream<E> stream() {
        return null;
    }
}
