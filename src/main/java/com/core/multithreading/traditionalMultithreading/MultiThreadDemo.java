package main.java.com.core.multithreading.traditionalMultithreading;

class NewThreads implements Runnable {
    String name; // name of thread

   NewThreads(String threadname) {
name=threadname;
    }

    @Override
    public void run() {

    }
}

public class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThreads("One"); // start threads
        new NewThreads("Two");
        new NewThreads("Three");

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}