package com.designpattern.iterator;

import java.util.List;

public class IteratorImpl<E> implements Iterator<E>{

    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List list) {
        this.list = list;
    }

    public E next() {
        System.out.println("当前位置："+ cursor + ":");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    public boolean hasNext() {

        return cursor <= list.size() - 1;
    }
}
