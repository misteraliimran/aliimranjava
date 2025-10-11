package lesson8;

public class HelloThreads {
    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        Thread t2 = new WorldThread();

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
