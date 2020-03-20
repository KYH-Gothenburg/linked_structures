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

    public void print() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}