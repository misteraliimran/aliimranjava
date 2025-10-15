package lesson8;

public class EvenNumbers implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}