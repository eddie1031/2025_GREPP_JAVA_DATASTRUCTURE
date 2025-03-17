package io.eddie;

public interface Collection<E> extends Iterable<E> {

    void add(E e);

    void remove(E e);

    boolean isEmpty();

    int size();

    boolean contains(E e);

}
