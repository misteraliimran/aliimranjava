package lesson8;

public class Main {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        WorldThread t2 = new WorldThread();
        t1.start();
        t2.start();
    }
}
