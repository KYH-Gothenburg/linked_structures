package main.java;

import java.util.Iterator;

class ListIterator<T> implements Iterator<T> {
    Node<T> current;

    public ListIterator(Node<T> node) {
        current = node;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

}