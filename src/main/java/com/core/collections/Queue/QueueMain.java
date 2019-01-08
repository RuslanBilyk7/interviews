package main.java.com.core.collections.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {

        // Create and initialize a QueueMain using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding new elements to the QueueMain (The Enqueue operation)
        queue.add("aaa");
        queue.add("ddd");
        queue.add("ffff");
        queue.add("cccc");
        queue.add("kkkk");
        queue.offer("gggg");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println("Queue " + queue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = queue.remove();
        System.out.println("Removed from queue : " + name + " | New Queue : " + queue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = queue.poll();
        System.out.println("Removed from queue : " + name + " | New Queue : " + queue);

        // Check is a Queue is empty
        System.out.println("is queue empty? : " + queue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of queue : " + queue.size());

        // Check if the Queue contains an element
        String name2 = "ffff";
        if (queue.contains(name2)) {
            System.out.println("queue contains " + name2);
        } else {
            System.out.println(" queue doesn't contain " + name2);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheQueue = queue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstPersonInTheQueue = queue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheQueue);

        System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
        queue.forEach(name3 -> {
            System.out.println(name3);
        });

        System.out.println("\n=== Iterating over a Queue using iterator() ===");
        Iterator<String> queueIterator = queue.iterator();
        while (queueIterator.hasNext()) {
            String name6 = queueIterator.next();
            System.out.println(name6);
        }

        System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
        queueIterator = queue.iterator();
        queueIterator.forEachRemaining(name4 -> {
            System.out.println(name4);
        });

        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for (String name5 : queue) {
            System.out.println(name5);
        }
    }
}
