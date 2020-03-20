package main.java;

import java.util.Iterator;

class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void insertTail(T data) {
        Node<T> node = new Node<T>(data);

        // List is empty
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        count++;
    }

    public void insertHead(T data) {
        Node<T> node = new Node<T>(data);

        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
        }
        head = node;
        count++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return count;
    }

    public void clear() {
        Node<T> current = head;

        while (current != null) {
            // Mohas lösning, som vi använder
            Node<T> next = current.getNext();
            current.setPrev(null);
            current.setNext(null);
            current = next;

            // Min krånliga lösning
            // current.setPrev(null);
            // current = current.getNext();
            // if(current != null){
            // current.getPrev().setNext(null);
            // }
        }
        head = null;
        tail = null;
        count = 0;
    }

    public boolean find(T data) {
        Node<T> current = head;

        while (current != null) {
            // Angelas lösning
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T removeTail() {
        // If list is empty
        if (tail == null) {
            return null;
        }
        // Only one item in list
        if (tail.getPrev() == null) {
            T data = tail.getData();
            tail = null;
            head = null;
            count = 0;
            return data;
        }
        Node<T> prev = tail.getPrev();
        tail.setPrev(null);
        T data = tail.getData();
        tail = prev;
        tail.setNext(null);
        count--;
        return data;
    }

    public T removeHead() {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            T data = head.getData();
            tail = null;
            head = null;
            count = 0;
            return data;
        }
        Node<T> next = head.getNext();
        head.setNext(null);
        T data = head.getData();
        head = next;
        head.setPrev(null);
        count--;
        return data;
    }

    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        Node<T> current = head;

        while (current != null) {
            // Angelas lösning
            if (current.getData().equals(data)) {
                // First node in list
                if (current == head) {
                    removeHead();
                    return true;
                }
                // Last node in list
                if (current == tail) {
                    removeTail();
                    return true;
                }

                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                current.setPrev(null);
                current.setNext(null);
                count--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(head);
    }

}