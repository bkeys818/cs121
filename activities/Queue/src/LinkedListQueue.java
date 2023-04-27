public class LinkedListQueue <T> {

    private class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(T elem) {
        Node node = new Node(elem, null);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        T item = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return item;
    }

    public T peek() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return null;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count ++;
        }
        return count;
    }

    public String toString() {
        String string = "";
        for (Node node = head; node != null; node = node.next) {
            string += String.format("%s%n", node.data);
        }
        return string;
    }
}
