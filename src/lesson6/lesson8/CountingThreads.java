package lesson8;

public class CountingThreads {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            synchronized (counter) {
                counter.countRange(1, 5);
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (counter) {
                counter.countRange(6, 10);
            }
        });

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
