package main.java.com.core.multithreading.traditionalMultithreading;

//// Create a second thread.
//class NewThread implements Runnable {
//    Thread t;
//
//    NewThread() {
//        // Create a new, second thread
//        /*Здесь создаешь новый поток и в качестве работы, которую нужно сделать ложишь ему this. а this  ссылается на объект класса в котором оно используется, этот this это ссылка на объект того класса, который имплементит Runnable. Runnable - это некая работа, а Thread - это  некий работник/
//         * In this line you have created a new thread t that has a name of "Demo Thread" and has the run() method of your "NewThread" object which implements the Runnable interface registered as the run method to be invoked when the thread t is started.         * В этой строке вы создали новый поток t с именем «Demo Thread» и методом run () вашего объекта «NewThread», который реализует интерфейс Runnable, зарегистрированный как метод run, который вызывается, когда поток t началось. */
//        t = new Thread(this, "Demo Thread");
//        System.out.println("Child thread: " + t);
//        t.start(); // Start the thread
//    }
//    /* https://coderanch.com/t/234237/java/threads-java#1090421 Метод start () * не вызывает метод run (). Метод start () запускает новый поток, который, в свою очередь, вызывает метод run (). Как только метод start () запускает новый поток, они теперь параллельны. Сначала может выполняться метод run (), основной поток, который создал новый поток, может запускаться первым, и они могут переключать контекст в любое время. */
//
//    // This is the entry point for the second thread.
//    public void run() {
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Child Thread: " + i);
//                Thread.sleep(500);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Child interrupted.");
//        }
//        System.out.println("Exiting child thread.");
//    }
//}
//
//class ThreadDemo {
//    public static void main(String args[]) {
//        new NewThread(); // create a new thread
//
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Main Thread: " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }
//        System.out.println("Main thread exiting.");
//    }
//}


//The same program, but in this program we are using extending the class of Thread
class NewThread extends Thread {

    NewThread() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        new NewThread(); // create a new thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
/*super ( ) в классе NewThread вызывает конструктор суперкласса Thread(), общая
форма которого приведена ниже , где параметр имя_ потока обозначает имя порождаемого
потока исполнения.
puЬlic Тhread ( Strinq имя потока)
super(name)вызывает родительский конструктор для текущего экземпляра, давая ему шанс инициализировать свою часть экземпляра до того, как подкласс начнет процесс инициализации своих частей экземпляра
*/