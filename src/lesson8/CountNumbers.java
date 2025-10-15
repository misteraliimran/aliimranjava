package lesson8;

public class CountNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        CountNumbers t = new CountNumbers();
        t.start();
    }
}
