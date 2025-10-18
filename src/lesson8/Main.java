package lesson8;

public class Main {
    public static void main(String[] args) {
        HelloThrea t1 = new HelloThrea();
        WorldThrea t2 = new WorldThrea();
        t1.start();
        t2.start();
    }
}
