package io.eddie.linkedList;

import io.eddie.arrayList.List;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size = 0;

    public void addFirst(E e) {

        Node<E> newNode = new Node<>(e);

        // 자료구조가 비어있을경우
        if ( isEmpty() ) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;

    }

    public void addLast(E e) {

        Node<E> newNode = new Node<>(e);

        if ( isEmpty() ) {
            tail = newNode;
            head = newNode;
        } else {
            if ( tail != null ) {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }

        size++;

    }

    @Override
    public void add(int index, E e) {

        if ( index < 0 || index > size ) {
            throw new IndexOutOfBoundsException();
        }

        if ( index == 0 ) {
            addFirst(e);
            return;
        }

        if ( index == size ) {
            addLast(e);
            return;
        }

        Node<E> newNode = new Node<>(e);

        Node<E> cur = head;

        for ( int i = 0; i < index - 1; i++ ) {
            cur = cur.next;
        }

        newNode.next = cur.next;
        newNode.prev = cur;

        if ( cur.next != null ) {
            cur.next.prev = newNode;
        }

        size++;

    }

    @Override
    public E get(int index) {

        if ( index < 0 || index > size ) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> cur = head;

        for ( int i = 0; i < index; i++ ) {
            cur = cur.next;
        }

        return cur.data;
    }

    public E removeFirst() {

        if ( isEmpty() ) {
            throw new RuntimeException("Linked list is empty");
        }

        E removedData = head.data;




        return removedData;
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
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    private static class Node<E> {

        Node<E> prev;
        Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
        }

    }

}
