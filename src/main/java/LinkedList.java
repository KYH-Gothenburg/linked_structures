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

    public boolean find(T data) {
        // Sant om data finns i listan
    }

    public T removeTail() {
        // Ta bort sista noden och returnera dess data
    }

    public T removeHead() {
        // Ta bort första noden och returnera dess data
    }

    public boolean remove(T data) {
        // Om data finns i listan, ta bort den noden.
        // Returnera sant om vi hittade något att ta bort annars falskt
    }

    public void print() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}