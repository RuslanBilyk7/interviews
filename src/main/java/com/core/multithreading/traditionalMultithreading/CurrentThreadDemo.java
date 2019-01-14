package main.java.com.core.multithreading.traditionalMultithreading;

class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        // change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t); //Thread[My Thread,5,main]
        System.out.println("After name change: " + t.getName());// My Thread

        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);//  t.sleep(1000); here it works the same

            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}