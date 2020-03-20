package main.java;

class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
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
    }

    public void insertHead(T data) {
        // Implement this
    }

    public boolean isEmpty() {
        // Returnera sant om listan är tom, annars falskt
    }

    public int size() {
        // Returnerar antalet noder i listan
    }

    public void clear() {
        // Tömmer listan
    }

    public void print() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}