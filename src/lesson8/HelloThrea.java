package lesson8;

public class HelloThrea extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}