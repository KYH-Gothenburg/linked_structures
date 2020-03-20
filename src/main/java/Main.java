package main.java;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.insertTail(5);
        ll.insertTail(6);
        ll.insertHead(1);
        ll.insertHead(2);
        ll.insertHead(3);
        ll.insertHead(4);

        for (int value : ll) {
            System.out.println(value);
        }
        ll.removeHead();
        ll.removeTail();
        ll.remove(1);
        System.out.println("The size is: " + ll.size());

    }
}