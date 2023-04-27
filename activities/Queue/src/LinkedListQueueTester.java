//******************************************************************
//  Activity 33
//  Name: Ben Keys
//  Data Structures Date: 04/01/2023
//******************************************************************
//  A queue demo.
//******************************************************************

public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue<String> queue = new LinkedListQueue<>();

        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue);

        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue);

        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println("Remove " + queue.dequeue() + "\n");

        System.out.println(queue);

        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek() + "\n");

        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek() + "\n");

        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek() + "\n");

        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek() + "\n");

        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek() + "\n");

        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}
